package com.itop.kuava.utils;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *普通的GET请求
 */
public class Httpclient {
    public static void doGet(String url) throws Exception {
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // 创建http GET请求
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            // 执行请求
            response = httpclient.execute(httpGet);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                //请求体内容
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
                //内容写入文件
                System.out.println("内容长度："+content.length());
            }
        } finally {
            if (response != null) {
                response.close();
            }
            //相当于关闭浏览器
            httpclient.close();
        }
    }
}