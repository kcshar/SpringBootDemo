package com.kc.utils;

import com.alibaba.fastjson2.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kc
 * @date 2024/4/23 17:20
 */
public class Result {
    public static String okGetString(){
        Map<String, Object> map = new HashMap<>();
        map.put("code",200);
        map.put("message","ok");
        String s = JSONObject.toJSONString(map);
        return s;
    }
    public static String okGetDelString(String message){
        Map<String, Object> map = new HashMap<>();
        map.put("code",200);
        map.put("message",message);
        String s = JSONObject.toJSONString(map);
        return s;
    }

    public static String okGetStringByData(String message, Object data){
        Map<String, Object> map = new HashMap<>();
        map.put("code",200);
        map.put("message",message);
        map.put("data", data);
        String s = JSONObject.toJSONString(map);
        return s;
    }
}
