package com.kyh.system.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
	//登錄
	@RequestMapping(value = "/register", method = { RequestMethod.POST, RequestMethod.GET })
	public String register() {
		return "/common/register";
	}
	
	@RequestMapping(value = "/register/form", method = { RequestMethod.POST, RequestMethod.GET })
	public String registerForm(@RequestParam Integer syainId,
			 @RequestParam String firstNameKanji,
	         @RequestParam String lastNameKanji,
	         @RequestParam Integer seibetu,
	         @RequestParam Integer syozokuKaisya,
	         @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date nyuusyaDate,
	         @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date taisyaDate,
	         @RequestParam Integer syokugyoKind,
	         @RequestParam String kinyukikanCode,
	         @RequestParam(required = false) String kinyukikanName,
	         @RequestParam String sitenCode,
	         @RequestParam(required = false) String sitenName,
	         @RequestParam(required = false) Integer kouzaKind,
	         @RequestParam String kouzaNum,
	         @RequestParam String meigiName,
	         @RequestParam(required = false) String itOs,
	         @RequestParam String itBikou
	         , Model model) {
		// 입력된 모든 파라미터 값 출력
	    System.out.println("syainId: " + syainId);
	    System.out.println("firstNameKanji: " + firstNameKanji);
	    System.out.println("lastNameKanji: " + lastNameKanji);
	    System.out.println("seibetu: " + seibetu);
	    System.out.println("syozokuKaisya: " + syozokuKaisya);
	    System.out.println("nyuusyaDate: " + nyuusyaDate);
	    System.out.println("taisyaDate: " + taisyaDate);
	    System.out.println("syokugyoKind: " + syokugyoKind);
	    System.out.println("kinyukikanCode: " + kinyukikanCode);
	    System.out.println("kinyukikanName: " + kinyukikanName);
	    System.out.println("sitenCode: " + sitenCode);
	    System.out.println("sitenName: " + sitenName);
	    System.out.println("kouzaKind: " + kouzaKind);
	    System.out.println("kouzaNum: " + kouzaNum);
	    System.out.println("meigiName: " + meigiName);
	    System.out.println("itOs: " + itOs);
	    System.out.println("itBikou: " + itBikou);
	    
	    manageService.registerResult(
	            syainId,
	            firstNameKanji,
	            lastNameKanji,
	            seibetu,
	            syozokuKaisya,
	            nyuusyaDate,
	            taisyaDate,
	            syokugyoKind,
	            kinyukikanCode,
	            kinyukikanName,
	            sitenCode,
	            sitenName,
	            kouzaKind,
	            kouzaNum,
	            meigiName,
	            itOs,
	            itBikou
	        );
		return "redirect:/manage/";
	}
	
	//更新
	@RequestMapping(value = "/update", method = { RequestMethod.POST, RequestMethod.GET })
	public String update() {
		return "/common/update";
	}
	
	//檢索
	@RequestMapping(value = "/search", method = { RequestMethod.POST, RequestMethod.GET })
	public String searchEmployees(@RequestParam String lastNameKanji,
            Model model) {
			
			System.out.println("입력 이름:" + lastNameKanji);
			List<Staff> employees = manageService.searchEmployees(lastNameKanji);
			model.addAttribute("employees", employees);
			
			//검색된 행 수
		    int count = manageService.count(lastNameKanji);
		    System.out.println(count);
		    model.addAttribute("count", count);
            return "/common/manage";
	}

}
