<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"
%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	#container {
		margin: 0 auto;
        width: 1600px;
        height: 960px;
        border: black 1px solid;
	}
	
	#header{
	 	width: 100%;
        height: 10%;
	}
	
	#sidebar-left {
		
	}
	
	#footer {
	
	}
</style>
<title><tiles:insertAttribute name="title" /></title>
</head>
<body>
<div id="container">
      <div id="header">
         <tiles:insertAttribute name="header"/>
      </div>
      <div id="sidebar-left">
          <tiles:insertAttribute name="side"/>
      </div>
      <div id="content">
          <tiles:insertAttribute name="body"/>
      </div>
      <div id="footer">
          <tiles:insertAttribute name="footer"/>
      </div>
    </div>
</body>
</html>