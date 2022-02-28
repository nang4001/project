package com.myspring.pro27.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro27.member.vo.CarVO;
import com.myspring.pro27.member.vo.CompanyVO;
import com.myspring.pro27.member.vo.DeptVO;
import com.myspring.pro27.member.vo.EmpVO;
import com.myspring.pro27.member.vo.ItemVO;
import com.myspring.pro27.member.vo.MemberVO;
import com.myspring.pro27.member.vo.QualityTestVO;

public interface MemberService {
	 public List listMembers() throws DataAccessException;
	 public int addMember(MemberVO memberVO) throws DataAccessException;
	 public int removeMember(String id) throws DataAccessException;
	 public MemberVO login(MemberVO memberVO) throws Exception;
	 public List listCar() throws DataAccessException;
	 public CompanyVO companyInfo(CompanyVO companyVO) throws DataAccessException;
	 public List listEmp() throws DataAccessException;
	 public List listDept() throws DataAccessException;
	 public ItemVO itemInfo(ItemVO itemVO) throws DataAccessException;
	 public List qualityTest() throws DataAccessException;
	 public int insertDept(DeptVO deptVO) throws DataAccessException;
	 public int insertEmp(EmpVO empVO) throws DataAccessException;
	 public int insertCar(CarVO carVO) throws DataAccessException;
	 public int insertCompany(CompanyVO companyVO) throws DataAccessException;
	 public int insertQuality(QualityTestVO qualityTestVO) throws DataAccessException;
	 public int deleteCompany(CompanyVO companyVO) throws DataAccessException;
	 public int updateCompany(CompanyVO companyVO) throws DataAccessException;
	 public int updateEmp(EmpVO empVO) throws DataAccessException; 
}