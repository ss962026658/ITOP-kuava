package com.itop.kuava.utils;

public class Test2 {
    public static void main(String[] args) {
        try {
            int i = 1;
            while (1==1){
                Httpclient.doGet("http://39.99.158.87:80/homePage/getNewsTodayHot");
                System.out.println("=================i:"+i++);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
