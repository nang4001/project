package com.myspring.pro27.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myspring.pro27.member.vo.CarVO;
import com.myspring.pro27.member.vo.CompanyVO;
import com.myspring.pro27.member.vo.DeptVO;
import com.myspring.pro27.member.vo.EmpVO;
import com.myspring.pro27.member.vo.MemberVO;
import com.myspring.pro27.member.vo.QualityTestVO;

public interface MemberController {
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView addMember(@ModelAttribute("info") MemberVO memberVO,HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView removeMember(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView login(@ModelAttribute("member") MemberVO member,
                              RedirectAttributes rAttr,
                              HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView carList(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView companyInfo(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView listEmp(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView listDept(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView itemInfo(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView qualityTest(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView insertCompany(@ModelAttribute("company") CompanyVO company,
            RedirectAttributes rAttr,
            HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView updateCompany(CompanyVO companyVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception;
	public ModelAndView deleteCompany(CompanyVO companyVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception;
	public ModelAndView insertDept(@ModelAttribute("dept") DeptVO deptVO, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView insertEmp(@ModelAttribute("emp") EmpVO empVO, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView updateEmp(@ModelAttribute("emp") EmpVO empVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception;
	public ModelAndView insertCar(CarVO carVO, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView insertQuality(QualityTestVO qualityTestVO, HttpServletRequest request, HttpServletResponse response) throws Exception;
}