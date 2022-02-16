package com.isurus.commission.produce.profile.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/produce/profile")
public class ProduceProfileController {

    @GetMapping("/main")
    public String profileMain(){
        
        return "";
    }
}
