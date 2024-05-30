package com.example.joy.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Login")
public class LoginController {

    @RequestMapping(value = "/LoginPage")
    public String loginController(HttpServletRequest request, Model model, RedirectAttributes redirectAttributes)throws Exception{

        return "/Login/LoginMain";
    }

}
