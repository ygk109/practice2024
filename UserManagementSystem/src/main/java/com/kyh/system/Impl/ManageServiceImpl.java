package com.kyh.system.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyh.system.entity.Staff;
import com.kyh.system.mapper.ManageMapper;
import com.kyh.system.service.ManageService;

@Service
public class ManageServiceImpl implements ManageService {

	@Autowired
	private ManageMapper manageMapper;

	@Override
	public List<Staff> searchEmployees(String lastNameKanji) {
	    return manageMapper.findByCriteria(lastNameKanji);
	}

	@Override
	public List<Staff> findAll() {
		return manageMapper.findAll();
		
	}
  

}
