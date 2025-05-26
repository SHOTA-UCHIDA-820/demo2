package com.example.demo;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;


@Controller
public class ContactController {

    @GetMapping("/")
    public String contact(Model model) {
        User user = new User();
        user.setName("田中太郎");
        user.setEmail("tanaka.taro@example.com");
        user.setPhoneNumber("000-000-0000");

        List<String> inquiries = List.of("◯◯◯の問い合わせ", "×××の問い合わせ", "△△△の問い合わせ");

     
        Map<String, String> menu = new LinkedHashMap<>();
        menu.put("TOP", "/");            
        menu.put("ABOUT", "/about");
        menu.put("CONTACT", "/contact");

        model.addAttribute("user", user);
        model.addAttribute("inquiryTypes", inquiries);
        model.addAttribute("menuLinks", menu); 

        return "contact";
    }
}

