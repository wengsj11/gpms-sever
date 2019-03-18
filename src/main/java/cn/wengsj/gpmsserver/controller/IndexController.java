package cn.wengsj.gpmsserver.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    public Map<String, String> index() {
        Map map = new HashMap();
        map.put("name", "daixinhai");
        map.put("age", 32);
        return map;
    }
}
