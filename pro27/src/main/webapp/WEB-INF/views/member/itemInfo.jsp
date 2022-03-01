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

<title>Item</title>
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
<form method="post" action="${contextPath}/member/itemInfo.do">
<div id="left-side">
        <table align="center" border="1px solid">
        	<tr bgcolor="lightblue">
                <td>선택</td>
                <td>품번</td>
                <td>품목명</td>
                <td>로트번호</td>
                <td>주문일</td>
                <td>수량</td>
                <td>시리얼번호</td>
                <td>단가</td>
                <td>부가세</td>
            </tr>
           <c:forEach var="i" items="${item }">
            <tr>
                <td align="center"><input type="checkbox"></td>
                <td>${i.itemCode }</td>
                <td>${i.itemName }</td>
                <td>${i.lotNo }</td>
                <td>${i.orderDate}</td>
                <td>${i.quantity}</td>
                <td>${i.serialNo }</td>
                <td>${i.unitPrice }</td>
                <td>${i.vat }</td>
            </tr>
            </c:forEach>
        </table>
	</div> 
</form>   

<form method="post" action="${contextPath}/member/insertItem.do">
    <div id="right-side" >
    	
        품목코드 <input type="text" name="itemCode"><br>
        품목명 <input type="text" name="itemName"><br>
        로트번호 <input type="text" name="lotNo"><br>
        주문일 <input type="text" name="orderDate"><br>
        수량 <input type="text" name="quantity"><br>
        시리얼번호 <input type="text" name="serialNo"><br>
        단가 <input type="text" name="unitPrice"><br>
        부가세 <input type="text" name="vat"><br>
        
        <input type="submit" value="등록"><br>
   </div>
</form>
    
</body>
</html>