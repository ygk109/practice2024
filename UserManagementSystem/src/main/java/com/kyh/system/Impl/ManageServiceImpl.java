package com.kyh.system.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kyh.system.entity.Staff;
import com.kyh.system.mapper.ManageMapper;
import com.kyh.system.service.ManageService;
@Repository
public class ManageServiceImpl implements ManageService {

	@Autowired
	private ManageMapper manageMapper;

	@Override
	public List<Staff> searchEmployees(String lastNameKanji) {
	    return manageMapper.findByCriteria(lastNameKanji);
	}
	@Override
	public void registerResult(
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
			String itBikou){
		}
	@Override
	public int count(String lastNameKanji) {
		return manageMapper.countDb(lastNameKanji);
	}
}
