package com.kyh.system.mapper;

import java.util.List;

import com.kyh.system.entity.Staff;

public interface ManageMapper {

	List<Staff> findByCriteria(String lastNameKanji);

}