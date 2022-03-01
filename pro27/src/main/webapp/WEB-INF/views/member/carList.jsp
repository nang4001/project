<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   isELIgnored="false"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
   request.setCharacterEncoding("UTF-8");
%> 


<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<style>
        #top {
            margin: auto;
            width: 800px;
            height: 40px;
            border: slateblue 1px solid;
        }
        #left-side {
            margin: auto;
            width: 35%;
            height: 600px;
            border: 1px saddlebrown solid;
            float: left;
        }
        table {
            width: 500px;
            border: 2px solid rgb(95, 95, 95);
        }
        table>tr>td {
            text-align: center;
        }
        #right-side {
            width: 42.5%;
            height: 600px;
            border: 1px saddlebrown solid;
            float: left;
        }
        #right-side > p {
        	width: auto;
        	border: 1px white solid;
            float: left;
        }
</style>
<script src="http://code.jquery.com/jquery-1.6.4.min.js"></script>
	<script type="text/javascript">
	
	</script>
</head>
<body>
	<div id="top">
        <a>차량 크기</a> <select>
                        <option value="">크기 선택</option>
                        <option value="01">1톤 화물차량</option>
                        <option value="02">5톤 화물차량</option>
                        <option value="03">10톤 화물차량</option>
                        </select>
        <a>차량 관리코드 <input type="text" name="carCode"></a>
        <a>차량 NO <input type="text" name="carNo"></a>
        <input type="submit" value="검색">
    </div>
    
    <form method="post" action="${contextPath }/member/carList.do">
    <div id="left-side">
    
        <table align="center" border="1px solid">
            <tr align="center" bgcolor="lightblue">
                <td>선택</td>
                <td>차량 관리코드</td>
                <td>차량 NO</td>
                <td>차량 크기</td>
                <td>비고</td>
            </tr>
            <c:forEach var="car" items="${listCar }">
            <tr>
            	<td align="center">
            	<!-- <input type="checkbox"> -->
            	<input type="checkbox" value="${car.carCode}"></td>
            	<td>${car.carCode }</td>
            	<td>${car.carNo }</td>
            	<td>${car.carWeight }</td>
            	<td>${car.carName }</td>
            </tr>
            </c:forEach>
        </table>
        <!-- <input type="button" value="삭제"> -->
    </div>    
    </form>
    
    <form method="post" action="${contextPath}/member/insertCar.do">
    	<div id="right-side">
    	<input type="submit" class="button" value="삭제" onclick="javascript: form.action='${contextPath}/member/deleteCar.do';"/>
    	<input type="submit" class="button" value="수정" onclick="javascript: form.action='${contextPath}/member/updateCar.do';"/>
    	<input type="submit" class="button" value="등록" onclick="javascript: form.action='${contextPath}/member/insertCar.do';"/><br><br>
    
        <p>차량 관리코드 <input type="text" name="carCode"></p>
        <p>차량NO <input type="text" name="carNo"></p>
        <p>차량 크기
        	<select name="carWeight">
            	<option value="">크기 선택</option>
            	<option value="1톤 화물차량">1톤 화물차량</option>
            	<option value="5톤 화물차량">5톤 화물차량</option>
            	<option value="10톤 화물차량">10톤 화물차량</option>
            </select></p>
        <p>비고 <input type="text" name="carName"></p>
    </div>
   </form>
   
</body>
</html>