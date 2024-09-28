package com.kyh.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "manage")
public class ManageController {

    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    public String manage() {
        return "/common/manage";
    }
    
    @RequestMapping(value = "/register", method = {RequestMethod.POST, RequestMethod.GET})
    public String register() {
    	return "/common/register";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.POST, RequestMethod.GET})
    public String update() {
    	return "/common/update";
    }

}
