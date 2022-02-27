package com.myspring.pro27.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myspring.pro27.member.service.MemberService;
import com.myspring.pro27.member.vo.CarVO;
import com.myspring.pro27.member.vo.CompanyVO;
import com.myspring.pro27.member.vo.DeptVO;
import com.myspring.pro27.member.vo.EmpVO;
import com.myspring.pro27.member.vo.ItemVO;
import com.myspring.pro27.member.vo.MemberVO;



@Controller("memberController")
//@EnableAspectJAutoProxy
public class MemberControllerImpl   implements MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberControllerImpl.class);
	@Autowired
	private MemberService memberService;
	@Autowired
	private MemberVO memberVO ;
	@Autowired
	private CompanyVO companyVO;
	@Autowired
	private ItemVO itemVO;
	
	@Override
	@RequestMapping(value = "/member/company.do", method = RequestMethod.GET)
	public ModelAndView company(CompanyVO company, RedirectAttributes rAttr, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		String site = mav.getViewName();
		System.out.println("getViewName�� " + site + " �엯�땲�떎.");
		return mav;
	}
	
	@Override
	@RequestMapping(value="/member/qualityTest.do" ,method = RequestMethod.GET)
	public ModelAndView qualityTest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		logger.info("viewName: "+ viewName);
		logger.debug("viewName: "+ viewName);
		List qualityTest = memberService.qualityTest();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("quality", qualityTest);
		return mav;
	}
	
	@Override
	@RequestMapping(value="/member/itemInfo.do" ,method = RequestMethod.GET)
	public ModelAndView itemInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		System.out.println("viewName: " +viewName);
		itemVO = memberService.itemInfo(itemVO);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		mav.addObject("item", itemVO);
		return mav;
	}
	
	@Override
	@RequestMapping(value="/member/empList.do" ,method = RequestMethod.GET)
	public ModelAndView listEmp(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		logger.info("viewName: "+ viewName);
		logger.debug("viewName: "+ viewName);
		List empList = memberService.listEmp();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("empList", empList);
		return mav;
	}

	@Override
	@RequestMapping(value="/member/deptList.do" ,method = RequestMethod.GET)
	public ModelAndView listDept(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		logger.info("viewName: "+ viewName);
		logger.debug("viewName: "+ viewName);
		List deptList = memberService.listDept();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("deptList", deptList);
		return mav;
	}
	
	@Override
	@RequestMapping(value="/member/companyInfo.do" ,method = RequestMethod.GET)
	public ModelAndView companyInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		System.out.println("viewName: " +viewName);
		companyVO = memberService.companyInfo(companyVO);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		mav.addObject("company", companyVO);
		return mav;
	}

	
	@Override
	@RequestMapping(value="/member/carList.do")
	public ModelAndView carList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
//		String viewName = (String)request.getAttribute("viewName");
		System.out.println("viewName: " +viewName);
//		logger.info("viewName: "+ viewName);
//		logger.debug("viewName: "+ viewName);
		List listCar = memberService.listCar();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("listCar", listCar);
		return mav;
	}
	
	@Override
	@RequestMapping(value="/member/listMembers.do" ,method = RequestMethod.GET)
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
//		String viewName = (String)request.getAttribute("viewName");
		//System.out.println("viewName: " +viewName);
		logger.info("viewName: "+ viewName);
		logger.debug("viewName: "+ viewName);
		List membersList = memberService.listMembers();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("membersList", membersList);
		return mav;
	}

	@Override
	@RequestMapping(value="/member/addMember.do" ,method = RequestMethod.POST)
	public ModelAndView addMember(@ModelAttribute("member") MemberVO member,
			                  HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    
		int result = 0;
		result = memberService.addMember(member);
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		return mav;
	}
	
	@Override
	@RequestMapping(value="/member/removeMember.do" ,method = RequestMethod.GET)
	public ModelAndView removeMember(@RequestParam("id") String id, 
			           HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		memberService.removeMember(id);
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		return mav;
	}
	
	@RequestMapping(value = { "/member/loginForm.do", "/member/memberForm.do" }, method =  RequestMethod.GET)
//	@RequestMapping(value = "/member/*Form.do", method =  RequestMethod.GET)
	public ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}
	
	@Override
	@RequestMapping(value = "/member/login.do", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("member") MemberVO member,
				              RedirectAttributes rAttr,
		                       HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    
	ModelAndView mav = new ModelAndView();
	memberVO = memberService.login(member);
	if(memberVO != null) {
		    HttpSession session = request.getSession();
		    session.setAttribute("member", memberVO);
		    session.setAttribute("isLogOn", true);
		    mav.setViewName("redirect:/member/listMembers.do");
	}else {
		    rAttr.addAttribute("result","loginFailed");
		    mav.setViewName("redirect:/member/loginForm.do");
	}
	return mav;
	}
    
	@Override
	@RequestMapping(value = "/member/logout.do", method =  RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		session.removeAttribute("member");
		session.removeAttribute("isLogOn");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/member/listMembers.do");
		return mav;
	}	

	@RequestMapping(value = "/member/*Form.do", method =  RequestMethod.GET)
	private ModelAndView form(@RequestParam(value= "result", required=false) String result,
						       HttpServletRequest request, 
						       HttpServletResponse response) throws Exception {
		//String viewName = getViewName(request);
		String viewName = (String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result",result);
		mav.setViewName(viewName);
		return mav;
		
	}
	

	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String viewName = uri.substring(begin, end);
		if (viewName.indexOf(".") != -1) {
			viewName = viewName.substring(0, viewName.lastIndexOf("."));
		}
		if (viewName.lastIndexOf("/") != -1) {
			viewName = viewName.substring(viewName.lastIndexOf("/", 1), viewName.length());
		}
		return viewName;
	}

	@Override
	@RequestMapping(value="/member/insertDept.do", method = RequestMethod.GET)
	public ModelAndView insertDept(@ModelAttribute("dept") DeptVO deptVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int result = 0;
		result = memberService.insertDept(deptVO);
		ModelAndView mav = new ModelAndView("redirect:/member/deptList.do");
		return mav;
	}

	@Override
	@RequestMapping(value="/member/insertEmp.do", method=RequestMethod.GET)
	public ModelAndView insertEmp(EmpVO empVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("html/text;charset=utf-8");
		int result = 0;
		result = memberService.insertEmp(empVO);
		ModelAndView mav = new ModelAndView("redirect:/member/empList.do");
		return mav;
	}

	@Override
	@RequestMapping(value="/member/insertCar.do")
	public ModelAndView insertCar(CarVO carVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("html/text;charset=utf-8");
		int result = 0;
		result = memberService.insertCar(carVO);
		ModelAndView mav = new ModelAndView("redirect:/member/carList.do");
		return mav;
	}
	
	
	
}