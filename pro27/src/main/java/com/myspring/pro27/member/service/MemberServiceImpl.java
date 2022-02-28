package com.myspring.pro27.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.pro27.member.dao.MemberDAO;
import com.myspring.pro27.member.vo.CarVO;
import com.myspring.pro27.member.vo.CompanyVO;
import com.myspring.pro27.member.vo.DeptVO;
import com.myspring.pro27.member.vo.EmpVO;
import com.myspring.pro27.member.vo.ItemVO;
import com.myspring.pro27.member.vo.MemberVO;
import com.myspring.pro27.member.vo.QualityTestVO;

@Service("memberService")
@Transactional(propagation = Propagation.REQUIRED)
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public List qualityTest() throws DataAccessException {
		List qualityTest = null;
		qualityTest = memberDAO.selectAllqualityTest();
		return qualityTest;
	}
	
	@Override
	public ItemVO itemInfo(ItemVO itemVO) throws DataAccessException {
		itemVO = memberDAO.itemInfo(itemVO);
		return itemVO;
	}
	
	@Override
	public List listEmp() throws DataAccessException {
		List empList = null;
		empList = memberDAO.selectAllEmpList();
		return empList;
	}
	
	@Override
	public List listDept() throws DataAccessException {
		List deptList = null;
		deptList = memberDAO.selectAllDeptList();
		return deptList;
	}
	
	@Override
	public CompanyVO companyInfo(CompanyVO companyVO) throws DataAccessException {
		companyVO = memberDAO.companyInfo(companyVO);
		return companyVO;
	}
	
	@Override
	public List listCar() throws DataAccessException {
		List carsList = null;
		carsList = memberDAO.selectCarList();
		return carsList;
	}
	
	@Override
	public List listMembers() throws DataAccessException {
		List membersList = null;
		membersList = memberDAO.selectAllMemberList();
		return membersList;
	}

	@Override
	public int addMember(MemberVO member) throws DataAccessException {
		return memberDAO.insertMember(member);
	}

	@Override
	public int removeMember(String id) throws DataAccessException {
		return memberDAO.deleteMember(id);
	}
	
	@Override
	public MemberVO login(MemberVO memberVO) throws Exception{
		return memberDAO.loginById(memberVO);
	}

	@Override
	public int insertDept(DeptVO deptVO) throws DataAccessException {
		return memberDAO.insertDept(deptVO);
	}

	@Override
	public int insertEmp(EmpVO empVO) throws DataAccessException {
		return memberDAO.insertEmp(empVO);
	}

	@Override
	public int insertCar(CarVO carVO) throws DataAccessException {
		return memberDAO.insertCar(carVO);
	}

	@Override
	public int insertCompany(CompanyVO companyVO) throws DataAccessException {
		return memberDAO.insertCompany(companyVO);
	}
	
	@Override
	public int insertQuality(QualityTestVO qualityTestVO) throws DataAccessException {
		return memberDAO.insertQuality(qualityTestVO);
	}
	
	@Override
	public int deleteCompany(CompanyVO companyVO) throws DataAccessException {
		return memberDAO.deleteCompany(companyVO);
	}

	@Override
	public int updateCompany(CompanyVO companyVO) throws DataAccessException {
		return memberDAO.updateCompany(companyVO);
	}

	@Override
	public int updateEmp(EmpVO empVO) throws DataAccessException {
		return memberDAO.updateEmp(empVO);
	}
}