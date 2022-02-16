package com.isurus.commission.produce;

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
        return "/produce/main called successfully";
    }
}
