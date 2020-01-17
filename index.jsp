<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.Random"%>
<!doctype html>
<html>
<head>
<meta http-equiv="content-type" content="text/html" charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
<meta http-equiv="Cache-Control" content="no-siteapp" /><link rel="alternate" media="handheld" href="#" />

<title>领取新年签</title>
<link type="text/css" rel="stylesheet" href="stylesheets/hope.css"/>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    function stop(){
    	//document.getElementById("seePicLink").click();
        return true;
    }
</script>
</head>

<body>
<%!
	private static String s;
%>
<%
	Random random = new Random();
	int id = random.nextInt(30);
	s = Integer.toString(id);
%>
<form action="<%=request.getContextPath()%>/GetServlet" method="post" onsubmit="return stop()">
 <div id="back">
 	<div id="l"></div>
 	<div id="topic">
 	<div id="ll"></div>
 	<p id="t">请输入您的姓名：</p>
 	</Br></Br></Br></Br>
 		<input maxlength="16" id="name" name="name" style="display:block;margin:0 auto">
 		</Br></Br></Br>
 		<a href="qian.jsp" style="display: none;" id="seePicLink"></a>
 		<input type="text" name="number" value="<%=s%>" style="display: none;">
 		<input type="submit" name="done" id="done" value="生成您的新年签" style="display:block;margin:0 auto">
 	</div>
 	<div id="r"></div>
</div>
</form>
</body>
</html>