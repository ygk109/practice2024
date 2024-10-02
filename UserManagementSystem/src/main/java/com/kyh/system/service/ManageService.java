package com.kyh.system.service;

import com.kyh.system.entity.Staff;
import com.kyh.system.entity.User;

import java.util.List;

public interface ManageService {
	 List<Staff> searchEmployees(int companyName, int jobName);

}

