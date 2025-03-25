package com.kob.backend.controller.pk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public Map<String, String> print(){
        List<Map<String, String>> list = new LinkedList<>();
        Map<String, String> m1 = new HashMap<>();
        m1.put("name", "小米");
        m1.put("translation", "bus");
        return m1;
    }
}
