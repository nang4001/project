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
    <title>companyInfo</title>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>

</head>
<body>
    <div id="wrap">
        <form align="center" method="get">
        <input type="submit" class="button" value="삭제" onclick="javascript: form.action='${contextPath}/member/deleteCompany.do';"/>
    	<input type="submit" class="button" value="수정" onclick="javascript: form.action='${contextPath}/member/updateCompany.do';"/>
        <input type="submit" class="button" value="등록" onclick="javascript: form.action='${contextPath}/member/insertCompany.do';"/><br><br>
        	<c:if test="${company != null }">
	        	<h2>회사명 <input type="text" name="comName" size="20px" value="${company.comName }" >
	        	<input type="text" name="classification" size="7px" value="${company.classification }" >
	        	<input type="text" name="tax" size="7px" value="${company.tax }" >
	            <!-- <select id="classification" name="classification" class="sel" aria-label="구분" value="${company.classification }">
	                <option value="">구분</option>
	                <option value="simpleTaxpayer">
	                    일반-간이
	                </option>
	                <option value="generalTaxpayer">
	                    일반-개인
	                </option>
	                <option value="corporation">
	                    법인
	                </option>
	            </select>
	            <select id="tax" name="tax" class="sel" aria-label="과세" value="${company.tax }">
	            	<option value="">구분</option>
	                <option value="taxation">
	                	과세
	                </option>
	                <option value="taxExemption">
	                    면세
	                </option>
	            </select> -->
	            </h2>
	            
	            <h4>회계년도 제 <input type="text" name="cardinal" id="cardinal" size="1px" value="${company.cardinal }" >기
	            <input type="date" id="startDate" name="startDate" value="${company.startDate }" min="1900-01-01" max="2100-12-31"  >
	            <input type="date" id="endDate" name="endDate" value="${company.endDate }" min="1900-01-01" max="2100-12-31"  >
	            </h4> 
	            
	            <h4>사업자 등록번호 <input type="text" name="BRNum" size="20px" value="${company.BRNum }" ></h4>
	            
	            <h4>법인 등록번호 <input type="text" name="CRNum" size="20px" value="${company.CRNum }" ></h4>
	            
	            <h4>대표자 성명 <input type="text" name="CEOName" size="20px" value="${company.CEOName }" ></h4>
	            
	            <h4>외국인 여부 <input type="text" value="${company.forign }" ></h4>
	            	<!-- <select id="kind" name="forign" class="sel" aria-label="외국인 여부">
		            	<option value="">구분</option>
		                <option value="local">
		                    0.내국인
		                </option>
		                <option value="foreigner">
		                    1.외국인
		                </option>
		            </select> </h4 -->
	            
	            <h4>주민등록번호 <input type="text" name="residentNum" size="20px" value="${company.residentNum }" ></h4>
	
	            <h4>
	                <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	
	                우편번호 : <input type="text" name="zipCode" style="width:80px; height:20px" value="${company.zipCode }" />
	                <button type="button" style="width:60px; height:32px;" onclick="openZipSearch()">검색</button><br>
	                주소 : <input type="text" name="address" style="width:300px; height:20px;" value="${company.address }"  /><br>
	                상세 : <input type="text" name="addressDetails" style="width:300px; height:20px;" value="${company.addressDetails }" />
	            	<script>
	                	function openZipSearch() {
		                	new daum.Postcode({
				                oncomplete: function(data) {
				            	    $('[name=zip]').val(data.zonecode); // 우편번호 (5자리)
					                $('[name=addr1]').val(data.address);
					                $('[name=addr2]').val(data.buildingName);
				                }       
		                	}).open();
	                	}
	            	</script>
	            </h4>
	
	            <h4>전화번호 <input type="text" name="areaCode" size="1px" value="${company.areaCode }" > ) <input type="text" name="comNumber" size="10px" value="${company.comNumber }" ></h4>
	            
	            <h4>FAX <input type="text" name="faxAreaCode" size="1px" value="${company.faxAreaCode }" > ) <input type="text" name="faxNumber" size="10px" value="${company.faxNumber }" ></h4>
	           
	            <h4>업태 <input type="text" name="businessCondition" size="20px" value="${company.businessCondition }" > </h4>
	           
	            <h4>종목 <input type="text" name="businessType" size="20px" value="${company.businessType }" > </h4>
	          
	            <h4>설립연월일 <input type="date" id="foundationDate" name="foundationDate" value="${company.foundationDate }" min="1900-01-01" max="2100-12-31" ></h4>
	            
	            <h4>개업연월일 <input type="date" id="openDate" name="openDate" value="${company.openDate }" min="1900-01-01" max="2100-12-31" ></h4>
	            
	            <h4>폐업연월일 <input type="date" id="closeDate" name="" value="${company.closeDate }" min="1900-01-01" max="2100-12-31" ></h4>
        	</c:if>
            <c:if test="${company == null }">
            	<h2>회사명 <input type="text" name="comName" size="20px">
	            <select name="classification" class="sel" aria-label="구분">
	                <option value="">구분</option>
	                <option value="일반-간이">
	                    일반-간이
	                </option>
	                <option value="일반-개인">
	                    일반-개인
	                </option>
	                <option value="법인">
	                    법인
	                </option>
	            </select>
	            <select name="tax" class="sel" aria-label="과세">
	            	<option value="">구분</option>
	                <option value="과세">
	                	과세
	                </option>
	                <option value="면세">
	                    면세
	                </option>
	            </select>
	            </h2>
	            
	            <h4>회계년도 제 <input type="text" name="cardinal" id="cardinal" size="1px">기
	            <input type="date" id="startDate" name="startDate" min="1900-01-01" max="2100-12-31" >
	            <input type="date" id="endDate" name="endDate" min="1900-01-01" max="2100-12-31">
	            </h4> 
	            
	            <h4>사업자 등록번호 <input type="text" name="BRNum" size="20px"></h4>
	            
	            <h4>법인 등록번호 <input type="text" name="CRNum" size="20px"></h4>
	            
	            <h4>대표자 성명 <input type="text" name="CEOName" size="20px"></h4>
	            
	            <h4>외국인 여부
	            	<select id="kind" name="forign" class="sel" aria-label="외국인 여부">
		            	<option value="">구분</option>
		                <option value="0.내국인">
		                    0.내국인
		                </option>
		                <option value="1.외국인">
		                    1.외국인
		                </option>
		            </select> </h4>
	            
	            <h4>주민등록번호 <input type="text" name="residentNum" size="20px"></h4>
	
	            <h4>
	                <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	
	                우편번호 : <input type="text" name="zipCode" style="width:80px; height:20px"/>
	                <button type="button" style="width:60px; height:32px;" onclick="openZipSearch()">검색</button><br>
	                주소 : <input type="text" name="address" style="width:300px; height:20px;" /><br>
	                상세 : <input type="text" name="addressDetails" style="width:300px; height:20px;" />
	            	<script>
	                	function openZipSearch() {
		                	new daum.Postcode({
				                oncomplete: function(data) {
				            	    $('[name=zip]').val(data.zonecode); // 우편번호 (5자리)
					                $('[name=addr1]').val(data.address);
					                $('[name=addr2]').val(data.buildingName);
				                }       
		                	}).open();
	                	}
	            	</script>
	            </h4>
	
	            <h4>전화번호 <input type="text" name="areaCode" size="1px"> ) <input type="text" name="comNumber" size="10px"></h4>
	            
	            <h4>FAX <input type="text" name="faxAreaCode" size="1px"> ) <input type="text" name="faxNumber" size="10px"></h4>
	           
	            <h4>업태 <input type="text" name="businessCondition" size="20px"> </h4>
	           
	            <h4>종목 <input type="text" name="businessType" size="20px"> </h4>
	          
	            <h4>설립연월일 <input type="date" id="foundationDate" name="foundationDate" min="1900-01-01" max="2100-12-31"></h4>
	            
	            <h4>개업연월일 <input type="date" id="openDate" name="openDate" min="1900-01-01" max="2100-12-31"></h4>
	            
	            <h4>폐업연월일 <input type="date" id="closeDate" name="" min="1900-01-01" max="2100-12-31"></h4>
            </c:if>
        </form>
    </div>
</body>
</html>