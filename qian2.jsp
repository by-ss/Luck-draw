<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.Random"%>
<!doctype html>
<html>
<head>
<meta http-equiv="content-type" content="text/html" charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
<meta http-equiv="Cache-Control" content="no-siteapp" /><link rel="alternate" media="handheld" href="#" />

<title>您的新年签</title>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>

<body style="text-align:center">
<%  
	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
 <div id="back" style="width: 100%; margin:0 auto; posistion: center;">
 	<img src="<%=basePath%>/edit/999.jpg">
 	<!-- <img src="/home/edit/999.jpg"> -->
</div>
</body>
</html>