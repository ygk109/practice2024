package com.kyh.system.entity;

public class Staff {
	
	private Integer userId;

    private String firstName;

    private String lastName;
    
    private String employeeName;

    private Integer gender;
    
    private Integer companyName;
    
    private Integer jobName;
    
    private String startDate;
    
    private String endDate;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getCompanyName() {
		return companyName;
	}

	public void setCompanyName(Integer companyName) {
		this.companyName = companyName;
	}

	public Integer getJobName() {
		return jobName;
	}

	public void setJobName(Integer jobName) {
		this.jobName = jobName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}