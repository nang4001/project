package com.myspring.pro27.member.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.pro27.member.vo.CarVO;
import com.myspring.pro27.member.vo.CompanyVO;
import com.myspring.pro27.member.vo.DeptVO;
import com.myspring.pro27.member.vo.EmpVO;
import com.myspring.pro27.member.vo.ItemVO;
import com.myspring.pro27.member.vo.MemberVO;
import com.myspring.pro27.member.vo.QualityTestVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectAllqualityTest() throws DataAccessException {
		List qualityTest = null;
		qualityTest = sqlSession.selectList("mapper.quality.selectAllqualityTest");
		return qualityTest;
	}
	
	@Override
	public ItemVO itemInfo(ItemVO itemVO) throws DataAccessException {
		return sqlSession.selectOne("mapper.item.selectItem");
	}
	
	@Override
	public List selectAllEmpList() throws DataAccessException {
		List<EmpVO> empList = null;
		empList = sqlSession.selectList("mapper.emp.selectAllEmpList");
		return empList;
	}
	
	@Override
	public List selectAllDeptList() throws DataAccessException {
		List<DeptVO> deptList = null;
		deptList = sqlSession.selectList("mapper.dept.selectAllDeptList");
		return deptList;
	}

	@Override
	public CompanyVO companyInfo(CompanyVO companyVO) throws DataAccessException {
		return sqlSession.selectOne("mapper.company.selectCompany");
	}
	
	@Override
	public List selectCarList() throws DataAccessException {
		List carsList = sqlSession.selectList("mapper.car.selectCarList");
		return carsList;
	}
	
	@Override
	public List selectAllMemberList() throws DataAccessException {
		List<MemberVO> membersList = null;
		membersList = sqlSession.selectList("mapper.member.selectAllMemberList");
		return membersList;
	}

	@Override
	public int insertMember(MemberVO memberVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.member.insertMember", memberVO);
		return result;
	}

	@Override
	public int deleteMember(String id) throws DataAccessException {
		int result = sqlSession.delete("mapper.member.deleteMember", id);
		return result;
	}
	
	@Override
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException{
		  MemberVO vo = sqlSession.selectOne("mapper.member.loginById",memberVO);
		return vo;
	}

	@Override
	public int insertDept(DeptVO deptVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.dept.insertDept", deptVO);
		return result;
	}

	@Override
	public int insertEmp(EmpVO empVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.emp.insertEmp", empVO);
		return result;
	}

	@Override
	public int insertCar(CarVO carVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.car.insertCar", carVO);
		return result;
	}

	@Override
	public int insertCompany(CompanyVO companyVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.company.insertCompany", companyVO);
		return result;
	}
	
	@Override
	public int insertQuality(QualityTestVO qualityTestVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.quality.insertQuality", qualityTestVO);
		return result;
	}
	
	@Override
	public int deleteCompany(CompanyVO companyVO) throws DataAccessException {
		int result = sqlSession.delete("mapper.company.deleteCompany", companyVO);
		return result;
	}

	@Override
	public int updateCompany(CompanyVO companyVO) throws DataAccessException {
		int result = sqlSession.update("mapper.company.updateCompany", companyVO);
		return result;
	}

	@Override
	public int updateEmp(EmpVO empVO) throws DataAccessException {
		int result = sqlSession.update("mapper.emp.updateEmp", empVO);
		return result;
	}
}