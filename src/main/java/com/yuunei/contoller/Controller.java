package com.yuunei.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("info")
    public String info(){
        return "Hello SpringBoot Info";
    }
}
