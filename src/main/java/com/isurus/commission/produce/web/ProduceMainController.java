package com.isurus.commission.produce.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/produce")
public class ProduceMainController {

    @GetMapping("/main")
    @ResponseBody
    public String abc(){
        System.out.println("하하");
        return "/produce/main called successfully";
    }
}
