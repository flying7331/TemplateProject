<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" title="" href="/maven-springmvc/common/js/jquery/jquery-ui-1.11.1.css" type="text/css" />
<script src="/maven-springmvc/common/js/jquery/jquery-1.11.1.min.js" type="text/javascript"></script>
<script src="/maven-springmvc/common/js/jquery/jquery-ui-1.11.1.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	$("#ajaxButton").click(function(){
		$.ajax({
			type : "POST",
			url : "/maven-springmvc/hello/ajaxSay",
			data : {name : "ajax"},
			dataType : "json",
			success : function(data){
				alert(data);
			},
			error : function(data, e){
				alert(e);
			}
		});
	});	
});
</script>
<title>Insert title here</title>
</head>
<body>
Hello ${name}! <br>
Hello ${MapAttribute }!<br>
<input type="button" id="ajaxButton" value="AjaxCall"/>
</body>
</html>