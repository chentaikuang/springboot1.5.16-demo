package com.xiaochen.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "test")
public class TestController {

    /**
     * visit url:http://localhost:8888/test/tips
     * @return
     */
    @GetMapping("tips")
    public Map tips(){
        Map map = new HashMap();
        map.put("tips","hello");
        map.put("curTime",new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        return map;
    }
}
