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
    <title>Document</title>
</head>
<body>
    <div id="form">
    <form method="get" action="${contextPath }/member/insertDept.do">
    	<input type="submit" value="등록">
        <table align="center">
            <tr bgcolor="lightblue" align="center">
                <td>부서코드</td>
                <td>부서명</td>
            </tr>
            <c:forEach var="dept" items="${deptList }">
            	<tr align="center">
            		<td>${dept.deptNo }</td>
            		<td>${dept.DName }</td>
            	</tr>
            </c:forEach>
            <tr align="center">
            	<td><input type="text" name="deptNo"></td>
            	<td><input type="text" name="dName"></td>
            </tr>
        </table>
    </form>
    </div>  
</body>
</html>