package com.myspring.pro27.member.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("empVO")
public class EmpVO {
	private int deptNo;
	private String dName;
	private int empNo;
	private String eName;
	private String empId;
	private String empPw;
	private String residentNum;
	private Date joinDate;
	private Date outDate;
	private int zipCode;
	private String address;
	private String addressDetails;
	private String phoneNum;
	private String fax;
	private String email;
	
	public EmpVO()
	{
		
	}
	
	public EmpVO(int deptNo, String dName, int empNo, String eName, String empId, String empPw, String residentNum, Date joinDate, Date outDate,
			int zipCode, String address, String addressDetails, String phoneNum, String fax)
	{
		this.deptNo = deptNo;
		this.dName = dName;
		this.empNo = empNo;
		this.eName = eName;
		this.empId = empId;
		this.empPw = empPw;
		this.residentNum = residentNum;
		this.joinDate = joinDate;
		this.outDate = outDate;
		this.zipCode = zipCode;
		this.address = address;
		this.addressDetails = addressDetails;
		this.phoneNum = phoneNum;
	}
	
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpPw() {
		return empPw;
	}
	public void setEmpPw(String empPw) {
		this.empPw = empPw;
	}
	public String getResidentNum() {
		return residentNum;
	}
	public void setResidentNum(String residentNum) {
		this.residentNum = residentNum;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getOutDate() {
		return outDate;
	}
	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
