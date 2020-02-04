package com.tracesource.monitor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class TestMsg {
    public static void main(String[] args) throws Exception{
        Init.start();
        while (true){
            Thread.sleep(2000);
            String msg = GetMessage.getMessage();
            System.out.println(msg);
            String t = msg.substring(msg.indexOf(":")+1,msg.indexOf(" "));
            System.out.println(t);
            String h = msg.substring(msg.lastIndexOf(":")+1,msg.length());
            System.out.println(h);
        }
    }
}
