package com.myspring.pro27.member.vo;

import org.springframework.stereotype.Component;

@Component("deptVO")
public class DeptVO {
	private int deptNo;
	private String dName;
	
	public DeptVO()
	{
		
	}
	
	public DeptVO(int deptNo, String dName)
	{
		this.deptNo = deptNo;
		this.dName = dName;
	}
	
	public int getDeptNo()
	{
		return deptNo;
	}
	
	public void setDeptNo(int deptNo)
	{
		this.deptNo = deptNo;
	}
	
	public String getDName()
	{
		return dName;
	}
	
	public void setDName(String dName)
	{
		this.dName = dName;
	}
}
