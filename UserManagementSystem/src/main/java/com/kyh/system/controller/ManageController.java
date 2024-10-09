package com.kyh.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kyh.system.entity.Staff;
import com.kyh.system.service.ManageService;
@Controller

@RequestMapping(value = "manage")

public class ManageController {
	@Autowired
	private ManageService manageService;

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
	public String searchEmployees(@RequestParam String lastNameKanji,
            Model model) {
			
			System.out.println("입력 이름:" + lastNameKanji);
			List<Staff> employees = manageService.searchEmployees(lastNameKanji);
			// 직원 검색 시 직원 이름을 추가하여 검색
			model.addAttribute("employees", employees);
		    
            return "/common/manage";
	}

}
