package com.example.go1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String goHome(HttpServletRequest request){
        System.out.println("dd");
        return "hello check99";

    }

}
