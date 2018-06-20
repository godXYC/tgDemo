package cn.cygia.tg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tg")
public class TestController {

    @RequestMapping(value = "/hello")
    public String test(){
        return "水电费大幅度";
    }
}
