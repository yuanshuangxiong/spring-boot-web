package com.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

//在templates目下的所有页面，智能通过controller跳转
//需要模板引擎的支持，thymeleaf
@Controller
public class IndexController {

    @RequestMapping("/")
   public String index(){
       return "login";
   }
}
