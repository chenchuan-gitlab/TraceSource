package com.tracesource.controller;

import com.tracesource.monitor.GetMessage;
import com.tracesource.utils.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("getTH")
public class GetTHController {
    @RequestMapping(value = "getTHMsg.action",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,String> getTH(){
        String msg = GetMessage.getMessage();
        Map<String,String> map = new HashMap<>();
        if(msg!=null&&!"".equals(msg)){
            String temperature = msg.substring(msg.indexOf(":")+1,msg.indexOf(" "));
            String humidity =  msg.substring(msg.lastIndexOf(":")+1,msg.length());
            String date = DateUtil.getDate_hms();
            map.put("temperature",temperature);
            map.put("humidity",humidity);
            map.put("date",date);
        }else{
            String date = DateUtil.getDate_hms();
            map.put("temperature","0");
            map.put("humidity","0");
            map.put("date",date);
        }
        return map;
    }
}
