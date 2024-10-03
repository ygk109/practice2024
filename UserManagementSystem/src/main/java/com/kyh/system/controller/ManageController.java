package com.kyh.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kyh.system.Impl.ManageServiceImpl;
import com.kyh.system.entity.Staff;
import com.kyh.system.service.ManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	@PostMapping("/register")
	public String registerStaff(@ModelAttribute Staff staff, Model model) {
	    manageService.saveStaff(staff);  // 직원 정보를 저장하는 메서드 호출
	    return "redirect:/manage/"; // 등록 후 관리 페이지로 리다이렉트
	}
	
	
	@RequestMapping(value = "/update", method = { RequestMethod.POST, RequestMethod.GET })
	public String update() {
		return "/common/update";
	}

	@RequestMapping(value = "/search", method = { RequestMethod.POST, RequestMethod.GET })
	public String searchEmployees(@RequestParam(required = false) Integer companyName,
            @RequestParam(required = false) Integer jobName,
            Model model) {
			List<Staff> employees= manageService.searchEmployees(companyName, jobName);
           
		    // 직원 검색 결과를 로그로 출력
		    Logger logger = LoggerFactory.getLogger(ManageController.class);
		    logger.info("Employees found: {}", employees);
			
			// 직원 검색 시 직원 이름을 추가하여 검색
            model.addAttribute("employees", employees);
        
            return "/common/manage";
	}
	
	@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
	public String searchTest(Model model) {
		List<Staff> test = manageService.findAll();
		model.addAttribute("test",test);
		return "/common/manage";
	}

}
