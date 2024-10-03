package com.kyh.system.entity;

public class Staff {
	
	private Integer userId;

    private String firstName;

    private String lastName;

    private int gender;
    
    private Integer companyName;
    
    private Integer jobName;
    
    private String startDate;
    
    private String endDate;

	public Integer getUserId() {
		return userId;
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

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
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

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


}