package com.kyh.system.service;

import java.util.List;

import com.kyh.system.entity.Staff;

public interface ManageService {
	 List<Staff> searchEmployees(String lastNameKanji);
}

