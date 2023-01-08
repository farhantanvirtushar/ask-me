package com.farhantanvir.askme.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(){
        return "hello";
    }

    @ResponseBody
    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String about(){
        return "about";
    }
}
