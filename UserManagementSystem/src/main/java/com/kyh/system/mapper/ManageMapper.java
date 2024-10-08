package com.kyh.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.kyh.system.entity.Staff;


@Component
@Mapper
public interface ManageMapper {

	List<Staff> findByCriteria(String lastNameKanji);

	List<Staff> findAll();
}