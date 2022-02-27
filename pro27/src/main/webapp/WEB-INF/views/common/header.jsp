<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  request.setCharacterEncoding("UTF-8");
//	String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
//	uri = request.getRequestURI();
//	String url = request.getRequestURL().toString();
//	String viewName = (String)request.getAttribute("viewName");
//	String site = mav.getViewName();
%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  /> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더</title>
<style>
img {
            width: 350px;
            height: 100%;
            border: springgreen solid 1px;
            float: left;
        }
        #button {
            width: 350px;
            height: 100%;
            border: steelblue solid 1px;
            float: left;
            text-align: center;
        }
        #button>input {
            margin-top: 7px;
        }
        #notice {
            width: 600px;
            height: 100%;
            border: violet 1px solid;
            float: left;
            text-align: center;
        }
        #notice>a {
            margin: auto;
            float: center;
        }
        #user {
            width: 292px;
            height: 100%;
            border: saddlebrown 1px solid;
            float: right;
        }
</style>
</head>
<script type="text/javascript">

</script>
<body>
<img src="http://placehold.it/350x95">
<section id="button">
	<c:choose>
		<c:when test="${contextPath }/member/company.do == ${contextPath }/member/company.do">
    		<input type="button" value="삭제" style="WIDTH: 80px; HEIGHT: 80px">
    		<input type="button" value="조회" style="WIDTH: 80px; HEIGHT: 80px">
    		<input type="submit" value="등록" style="WIDTH: 80px; HEIGHT: 80px">
    	</c:when>
    	<c:when test="${site }== /member/company">
    		<input type="button" value="삭제2" style="WIDTH: 80px; HEIGHT: 80px">
    		<input type="button" value="조회2" style="WIDTH: 80px; HEIGHT: 80px">
    		<input type="submit" value="등록2" style="WIDTH: 80px; HEIGHT: 80px">
    	</c:when>
    	<c:otherwise>
    		<%
    			//System.out.println("viewName은 " + viewName + "입니다.");
    		%>
    		<input type="button" value="삭제3" style="WIDTH: 80px; HEIGHT: 80px">
    		<input type="button" value="조회3" style="WIDTH: 80px; HEIGHT: 80px">
    		<input type="submit" value="등록3" style="WIDTH: 80px; HEIGHT: 80px">
    		${site }는??
    	</c:otherwise>
	</c:choose>
	<%-- <c:if test="${site != null}">
		<input type="button" value="삭제4" style="WIDTH: 80px; HEIGHT: 80px">
    	<input type="button" value="조회4" style="WIDTH: 80px; HEIGHT: 80px">
    	<input type="submit" value="등록4" style="WIDTH: 80px; HEIGHT: 80px">
	</c:if> --%>
</section>
<section id="notice">
    <a href="#">공지사항</a>
</section>
<section id="user">
	<c:choose>
          <c:when test="${isLogOn == true  && member!= null}">
            <h3>환영합니다. ${member.name }님!</h3>
            <a href="${contextPath}/member/logout.do"><h3>로그아웃</h3></a>
          </c:when>
          <c:otherwise>
	        <a href="${contextPath}/member/loginForm.do"><h3>로그인</h3></a>
	      </c:otherwise>
	   </c:choose></section>
</body>
</html>