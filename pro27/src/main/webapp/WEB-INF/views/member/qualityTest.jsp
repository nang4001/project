<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
   request.setCharacterEncoding("UTF-8");
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>qualityTest</title>
<style>
        #top {
            margin: auto;
            width: 800px;
            height: 40px;
            border: slateblue 1px solid;
        }
        #left-side {
            margin: auto;
            width: 40%;
            height: 600px;
            border: 1px saddlebrown solid;
            float: left;
        }
        table {
            width: auto;
            <!-- 500px -->
            border: 2px solid rgb(95, 95, 95);
        }
        table>tr>td {
            text-align: center;
        }
        #right-side {
            width: 37.5%;
            height: 600px;
            border: 1px saddlebrown solid;
            float: left;
            text-align: center;
        }
        #right-side > p {
        	width: auto;
        	border: 1px white solid;
        }
</style>
</head>
<body>
<form method="post" action="${contextPath}/member/qualityTest.do">
<div id="left-side">
        <table align="center" border="1px solid">
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
</form>

    <form method="post" action="${contextPath}/member/insertQuality.do">
    <div id="right-side" >
    	
        품목코드 <input type="text" name="itemCode"><br>
        품목명 <input type="text" name="itemName"><br>
        수량 <input type="text" name="quantity"><br>
        검사일 <input type="text" name="testDate"><br>
        검사결과 <input type="text" name="testResult"><br>
        로트번호 <input type="text" name="lotNo"><br>
        씨리얼번호 <input type="text" name="serialNo"><br>
        
        <input type="submit" value="등록"><br>
   </div>
   </form>
    
</body>
</html>