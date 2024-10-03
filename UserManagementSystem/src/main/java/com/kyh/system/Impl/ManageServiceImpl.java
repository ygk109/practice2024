package com.kyh.system.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.kyh.system.entity.Staff;
import com.kyh.system.entity.User;
import com.kyh.system.mapper.ManageMapper;
import com.kyh.system.mapper.UserMapper;
import com.kyh.system.service.ManageService;
import com.kyh.system.service.UserService;

@Service
public class ManageServiceImpl implements ManageService {

	@Autowired
	private ManageMapper manageMapper;

	@Override
	public List<Staff> searchEmployees(Integer companyName, Integer jobName) {
	    return manageMapper.findByCriteria(companyName, jobName);
	}

	@Override
    public void saveStaff(Staff staff) {
        manageMapper.save(staff);
    }
	
	@Override
	public List<Staff> findAll() {
		return manageMapper.findAll();
		
	}
  

}
