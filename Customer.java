package com.code;

import java.time.LocalDate;

public class Customer {
	private int customerId;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private String address;
	private LocalDate registerDate;
	private LocalDate planEnddate;
	private String PhoneNo;
	private MessPlan plan;
	private double finalAmount;
	
	
	
	public Customer(int customerId, String first_name, String last_name, String email, String password, String address,
			LocalDate registerDate, String phoneNo, MessPlan plan, double finalAmount) {
		super();
		this.customerId = customerId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.registerDate = registerDate;
		this.PhoneNo = phoneNo;
		this.plan = plan;
		this.finalAmount = finalAmount;
		
		
		
		
		
		
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public LocalDate getRegisterDate() {
		return registerDate;
	}



	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}



	public LocalDate getPlanEnddate() {
		return planEnddate;
	}



	public void setPlanEnddate(LocalDate planEnddate) {
		this.planEnddate = planEnddate;
	}



	public String getPhoneNo() {
		return PhoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}



	public MessPlan getPlan() {
		return plan;
	}



	public void setPlan(MessPlan plan) {
		this.plan = plan;
	}



	public double getFinalAmount() {
		return finalAmount;
	}



	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}



	public int getCustomerId() {
		return customerId;
	}



	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", password=" + password + ", address=" + address + ", registerDate="
				+ registerDate + ", planEnddate=" + planEnddate + ", PhoneNo=" + PhoneNo + ", plan=" + plan
				+ ", finalAmount=" + finalAmount + "]";
	}
	
	
	
	
	

}
