<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>qualityTest</title>
</head>
<body>
<div id="top">
        <table border="1px">
            <tr bgcolor="lightblue">
                <td>선택</td>
                <td>품목코드</td>
                <td>품목명</td>
                <td>수량</td>
                <td>검사일</td>
                <td>검사결과</td>
                <td>로트번호</td>
                <td>씨리얼번호</td>
            </tr>
            <c:forEach var="qlt" items="${quality }">
            <tr>
                <td align="center"><input type="checkbox"></td>
                <td>${qlt.itemCode }</td>
                <td>${qlt.itemName }</td>
                <td>${qlt.quantity}</td>
                <td>${qlt.testDate}</td>
                <td>${qlt.testResult }</td>
                <td>${qlt.lotNo }</td>
                <td>${qlt.serialNo }</td>
            </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>