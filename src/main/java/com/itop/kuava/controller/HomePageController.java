package com.itop.kuava.controller;

import com.itop.kuava.entity.*;
import com.itop.kuava.mapper.*;
import com.itop.kuava.utils.YunpianClient;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("homePage")
@Api(value = "homePage")
public class HomePageController {

    String appId = "15601929005";
    String appSecret = "ss1994820";

    @Autowired
    private CrmAccountInfoMapper crmAccountInfoMapper;
    @Autowired
    private LogFollowRecordMapper logFollowRecordMapper;
    @Autowired
    private NewsTodayHotMapper newsTodayHotMapper;
    @Autowired
    private SysVerifyCodeMapper sysVerifyCodeMapper;
    @Autowired
    private NewsExpressInfoMapper newsExpressInfoMapper;
    @Autowired
    private NewsVideoInfoMapper newsVideoInfoMapper;
    @Autowired
    private NewsRecommendMapper newsRecommendMapper;


    /*
     * @Description:发送验证码
     * @Author: ss
     * @Date: 2020/4/9 16:15
     * @Param: request
     * @Param: mobile
     * @return: java.lang.Object
     **/
    @RequestMapping(value = "/sendSms")
    public Object sendSms(HttpServletRequest request, String mobile) {
        try {
            String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);

            Result<SmsSingleSend> r = YunpianClient.sendMsg(mobile, verifyCode);
            Integer code = r.getCode();
            if (!(code == 0)){
                return HttpWrapper.error("短信发送失败");
            }

            SysVerifyCode sysVerifyCode = new SysVerifyCode();
            sysVerifyCode.setCodeType(2);
            Date day = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sysVerifyCode.setCreateTime(df.format(day));
            sysVerifyCode.setEnCode(verifyCode);
            sysVerifyCode.setToObject(mobile);
            sysVerifyCodeMapper.insert(sysVerifyCode);

            request.getSession().setAttribute("verifyCode", verifyCode);
            return HttpWrapper.success(verifyCode);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpWrapper.error("获取失败");
        }
    }

    /*
     * @Description:验证验证码，成功则返回关注人
     * @Author: ss
     * @Date: 2020/4/9 16:17
     * @Param: request
     * @Param: mobile
     * @Param: verifyCode
     * @return: java.lang.Object
     **/
    @RequestMapping(value = "/getVerification")
    public Object getVerification(
            HttpServletRequest request,
            String mobile,
            String verifyCode) {


        SysVerifyCode sysVerifyCode = new SysVerifyCode();
        sysVerifyCode.setEnCode(verifyCode);
        SysVerifyCode sysVerifyCodeResult = sysVerifyCodeMapper.selectOne(sysVerifyCode);

        try {
            if (!mobile.equals(sysVerifyCodeResult.getToObject())) {
                return HttpWrapper.error("验证码错误");
            }

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            if ((System.currentTimeMillis() - df.parse(sysVerifyCodeResult.getCreateTime()).getTime()) > 1000 * 60 * 5) {
                return HttpWrapper.error("验证码过期");
            }

            CrmAccountInfo crmAccountInfoResult = null;
            CrmAccountInfo crmAccountInfo = new CrmAccountInfo();
            crmAccountInfo.setMobile(mobile);
            crmAccountInfoResult = crmAccountInfoMapper.selectOne(crmAccountInfo);
            request.getSession().setAttribute("accountId", crmAccountInfo.getId());
            Map map = new HashMap();
            map.put("AccountId", crmAccountInfoResult.getId());
            List results = logFollowRecordMapper.selectByMap(map);
            return HttpWrapper.success(results);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpWrapper.error("验证码错误");
        }
    }

    /*
     * @Description:头条信息
     * @Author: ss
     * @Date: 2020/4/9 16:17
     * @Param:
     * @return: java.lang.Object
     **/
    @RequestMapping(value = "/getNewsTodayHot")
    public Object getNewsTodayHot() {
        try {
            List<NewsTodayHot> results = newsTodayHotMapper.selectList(null);
            return HttpWrapper.success(results);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpWrapper.error("信息获取失败");
        }
    }

    /*
     * @Description:快讯
     * @Author: ss
     * @Date: 2020/4/10 15:10
     * @Param:
     * @return: java.lang.Object
     **/
    @RequestMapping(value = "getNewsExpress")
    public Object getNewsExpress(){
        try {
            List<NewsExpressInfo> results = newsExpressInfoMapper.selectList(null);
            return HttpWrapper.success(results);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpWrapper.error("信息获取失败");
        }
    }

    /*
     * @Description:新闻推荐
     * @Author: ss
     * @Date: 2020/4/11 9:38
     * @Param:
     * @return: java.lang.Object
     **/
    @RequestMapping(value = "getNewsRecommend")
    public Object getNewsRecommend(){
        try {
            int i = 1;
            while (1==1){
                i = i*(i+1);
            }
//            List<NewsRecommend> results = newsRecommendMapper.selectList(null);
//            return HttpWrapper.success(results);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpWrapper.error("信息获取失败");
        }
    }

    /*
     * @Description:视频
     * @Author: ss
     * @Date: 2020/4/10 15:30
     * @Param:
     * @return: java.lang.Object
     **/
    @RequestMapping(value = "getNewsVideo")
    public Object getNewsVideo(){
        try {
            List<NewsVideoInfo> results = newsVideoInfoMapper.selectList(null);
            return HttpWrapper.success(results);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpWrapper.error("信息获取失败");
        }

    }

}
