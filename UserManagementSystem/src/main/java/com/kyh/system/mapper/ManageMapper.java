package com.kyh.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.kyh.system.entity.Staff;
import com.kyh.system.entity.User;

@Component
@Mapper
public interface ManageMapper {

	List<Staff> findByCriteria(@Param("companyName") Integer companyName,
            @Param("jobName") Integer jobName);

	void save(Staff staff);

	List<Staff> findAll();
}