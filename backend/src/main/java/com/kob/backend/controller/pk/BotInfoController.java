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
    public List<Map<String, String>> print(){
        List<Map<String, String>> list = new LinkedList<>();
        Map<String, String> m1 = new HashMap<>();
        m1.put("小米", "cars");
        m1.put("小周", "bus");
        Map<String, String> m2 = new HashMap<>();
        m2.put("peter", "666");
        m2.put("joy", "777");
        list.add(m1);
        list.add(m2);
        return list;
    }
}
