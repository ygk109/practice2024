package com.kyh.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kyh.system.Impl.ManageServiceImpl;
import com.kyh.system.entity.Staff;
import com.kyh.system.service.ManageService;

@Controller

@RequestMapping(value = "manage")

public class ManageController {
	@Autowired
	private ManageServiceImpl manageService;

	@RequestMapping(value = "/", method = { RequestMethod.POST, RequestMethod.GET })
	public String manage() {
		return "/common/manage";
	}

	@RequestMapping(value = "/register", method = { RequestMethod.POST, RequestMethod.GET })
	public String register() {
		return "/common/register";
	}

	@RequestMapping(value = "/update", method = { RequestMethod.POST, RequestMethod.GET })
	public String update() {
		return "/common/update";
	}

	@RequestMapping(value = "/search", method = { RequestMethod.POST, RequestMethod.GET })
    public String searchEmployees(@RequestParam(required = false) int companyName, 
                                  @RequestParam(required = false) int jobName,
                                  Model model) {
        // 검색 조건에 따라 직원 목록 검색
        List<Staff> employees = manageService.searchEmployees(companyName, jobName);
        model.addAttribute("employees", employees);
        System.out.println(companyName);
        return "/common/manage";
    }
}
