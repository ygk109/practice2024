package com.kyh.system.service;

import java.util.Date;
import java.util.List;

import com.kyh.system.entity.Staff;

public interface ManageService {
	List<Staff> searchEmployees(String lastNameKanji);

	void registerResult(
			Integer syainId,
			String firstNameKanji,
			String lastNameKanji,
			Integer seibetu,
			Integer syozokuKaisya,
			Date nyuusyaDate,
			Date taisyaDate,
			Integer syokugyoKind,
			String kinyukikanCode,
			String kinyukikanName,
			String sitenCode,
			String sitenName,
			Integer kouzaKind,
			String kouzaNum,
			String meigiName,
			String itOs,
			String itBikou
		);

	int count(String lastNameKanji);
	
	Staff searchById(Integer syainId);
	
    public void updateEmployee(
            Integer syainId, String firstNameKanji, String lastNameKanji, Integer seibetu,
            Integer syozokuKaisya, Date nyuusyaDate, Date taisyaDate, Integer syokugyoKind
    		);

	void deleteEmployee(Integer syainId);
}

