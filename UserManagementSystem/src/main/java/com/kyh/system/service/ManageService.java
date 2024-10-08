package com.kyh.system.service;

import com.kyh.system.entity.Staff;

import java.util.List;

public interface ManageService {
	 List<Staff> searchEmployees(String lastNameKanji);

	 List<Staff> findAll();

}

