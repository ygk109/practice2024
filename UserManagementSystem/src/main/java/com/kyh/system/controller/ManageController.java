package com.kyh.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kyh.system.service.UserService;

@Controller
@RequestMapping(value = "manage")
public class ManageController {

    @Autowired
    private UserService userService;

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
