package com.itop.kuava.utils;

import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;

import java.util.Map;

public class YunpianClient {

    public static String apikey = "bc5d16e7e51826e606c70ba3bdf7071f";

    public static Result<SmsSingleSend> sendMsg(String mobile, String verifyCode){
        com.yunpian.sdk.YunpianClient clnt = new com.yunpian.sdk.YunpianClient(apikey).init();
        Map<String, String> param = clnt.newParam(2);
        param.put(com.yunpian.sdk.YunpianClient.MOBILE, mobile);
        param.put(com.yunpian.sdk.YunpianClient.TEXT, "【艾拓普】您的短信验证码为："+verifyCode+"，请在5分钟内输入，如非本人操作，请忽略本短信。");
        Result<SmsSingleSend> r = clnt.sms().single_send(param);
        clnt.close();
        return r;
    }
}
