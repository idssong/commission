package com.isurus.commission.common.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CommonMainController {
    @GetMapping("/")
    public String indexMain (Model model){
        model.addAttribute("test", "This Text value is responded by model attribute.");
        return "index";
    }
}
