<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  request.setCharacterEncoding("UTF-8");
%> 
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<title>카테고리</title>
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
<style>
#box {
            width: 340px;
            height: 800px;
            border: thistle 1px solid;
            float: left;
            margin-right: 10px;
        }

        form {
            margin: 5px;
        }
</style>
<meta charset="UTF-8">
<title>카테고리</title>
</head>
<body>
	<form action="" width="350px">
                <input type="search" name="key" size="35px"> <input type="submit" style="WIDTH: 45px; HEIGHT: 25px" value="검색">
    </form>
            <div id="box">
                <li class="main">
                    관리메뉴
                    <ul class="sub" style="display:none">
                    	<li><a href="${contextPath}/member/companyInfo.do" class="no-underline">회사정보등록</a></li>
                    	<li><a href="${contextPath}/member/deptList.do"  class="no-underline">부서관리</a><br></li>
                        <li><a href="${contextPath}/member/empList.do"  class="no-underline">사원관리</a><br></li>
                        <li><a href="${contextPath}/member/itemInfo.do"  class="no-underline">품목등록</a><br></li>
                        <li><a href="${contextPath}/member/qualityTest.do"  class="no-underline">출고전검사</a><br></li>
                        <li><a href="${contextPath}/member/carList.do"  class="no-underline">차량관리</a><br></li>
                    </ul>
                </li>
            </div>
            <script>
                $(".main").click(function(){
                    if($(".sub").is(":visible")){
                        $(".sub").slideUp();
                    }
                    else{
                        $(".sub").slideDown();
                    }
                })
            </script>
</body>
</html>