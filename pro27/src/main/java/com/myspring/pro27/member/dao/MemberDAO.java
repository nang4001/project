package com.myspring.pro27.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspring.pro27.member.vo.CarVO;
import com.myspring.pro27.member.vo.CompanyVO;
import com.myspring.pro27.member.vo.DeptVO;
import com.myspring.pro27.member.vo.EmpVO;
import com.myspring.pro27.member.vo.ItemVO;
import com.myspring.pro27.member.vo.MemberVO;
import com.myspring.pro27.member.vo.QualityTestVO;


public interface MemberDAO {
	 public List selectAllMemberList() throws DataAccessException;
	 public int insertMember(MemberVO memberVO) throws DataAccessException ;
	 public int deleteMember(String id) throws DataAccessException;
	 public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
	 public List selectCarList() throws DataAccessException;
	 public CompanyVO companyInfo(CompanyVO companyVO) throws DataAccessException;
	 public List selectAllEmpList() throws DataAccessException;
	 public List selectAllDeptList() throws DataAccessException;
	 public List selectAllqualityTest() throws DataAccessException;
	 public List selectItemList() throws DataAccessException;
	 public int insertDept(DeptVO deptVO) throws DataAccessException;
	 public int insertEmp(EmpVO empVO) throws DataAccessException;
	 public int insertCar(CarVO carVO) throws DataAccessException;
	 public int insertCompany(CompanyVO companyVO) throws DataAccessException;
	 public int insertQuality(QualityTestVO qualityTestVO) throws DataAccessException;
	 public int deleteCompany(CompanyVO companyVO) throws DataAccessException;
	 public int updateCompany(CompanyVO companyVO) throws DataAccessException;
	 public int updateEmp(EmpVO empVO) throws DataAccessException;
	 public int insertItem(ItemVO itemVO) throws DataAccessException;
	 public int updateCar(String carCode) throws DataAccessException;
	 
}