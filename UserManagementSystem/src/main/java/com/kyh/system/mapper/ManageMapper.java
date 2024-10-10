package com.kyh.system.mapper;

import java.util.Date;
import java.util.List;

import com.kyh.system.entity.Staff;

public interface ManageMapper {

	List<Staff> findByCriteria(String lastNameKanji);

	void registerDb(Integer syainId,
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
			String itBikou);

	int countDb(String lastNameKanji);

	Staff searchByid(Integer syainId);
	
	void updateDb(Staff staff);
	
	void deleteDb(Integer syainId);

}