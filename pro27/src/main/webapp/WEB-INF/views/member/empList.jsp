<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>사원 정보</title>
    <style>
        #top {
            text-align: center;
        }
    </style>
</head>
<body>
    <form id="top" method="get" action="${contextPath }/member/searchEmp.do">
        부서 <select name="dept" class="sel" aria-label="구분">
            <option value="">구분</option>
            <option value="management">
                관리부
            </option>
            <option value="onSite">
                현장직
            </option>
            <option value="accounting">
                회계부
            </option>
            <option value="sales">
                영업부
            </option>
        	</select>
        사원명 <input type="text" name="search"> <input type="submit" value="검색">
    </form>
    <form id="bottom" method="get" action="${contextPath }/member/insertEmp.do">
    	<input type="submit" value="등록">
        <table align="center"  width="800px" border="1px solid">
            <tr bgcolor="lightblue" width="800px" align="center">
                <td></td>
                <td>사원코드</td>
                <td>사원명</td>
                <td>부서코드</td>
                <td>부서명</td>
                <td>입사일</td>
                <td>퇴사일</td>
            </tr>
            <c:forEach var="emp" items="${empList }">
            <tr>
                <td align="center"><input type="checkbox"></td>
                <td>${emp.empNo }</td>
                <td>${emp.eName}</td>
                <td>${emp.deptNo}</td>
                <td>${emp.dName}</td>
                <td>${emp.joinDate }</td>
                <td>${emp.outDate }</td>
            </tr>
            </c:forEach>
            <tr>
            	<td align="center"><input type="checkbox"></td>
                <td><input type="text" name="empNo"></td>
                <td><input type="text" name="eName"></td>
                <td>
                	<select name="deptNo">
                		<option value="10">10</option>
                		<option value="20">20</option>
                		<option value="30">30</option>
            			<option value="40">40</option>
        			</select>
        		</td>
        		
                <td>
                	<select name="dName">
                		<option value="ONSITE">ONSITE</option>
                		<option value="ACCOUNTING">ACCOUNTING</option>
                		<option value="SALES">SALES</option>
            			<option value="RESEARCH">RESEARCH</option>
        			</select>
        		</td>
                <td><input type="date" name="joinDate"></td>
                <td><input type="date" name=""></td>
            </tr>
        </table>
    </form>
</body>
</html>