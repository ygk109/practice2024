package com.kyh.system.entity;

public class Staff {
	
	private Integer userId;

    private String firstName;

    private String lastName;

    private int gender;
    
    private int companyName;
    
    private int jobName;
    
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

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getCompanyName() {
		return companyName;
	}

	public void setCompanyName(int companyName) {
		this.companyName = companyName;
	}

	public int getJobName() {
		return jobName;
	}

	public void setJobName(int jobName) {
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