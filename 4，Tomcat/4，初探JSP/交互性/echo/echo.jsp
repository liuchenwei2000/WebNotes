<html>
	<head>
		<title>
			Echo from server
		</title>
	</head>
	<body>
		<% 
		String value = request.getParameter("info");// 接收前端表单输入的内容
		out.println( "<h3>Your input is  " + value + "<h3>"); 
		%>
	</body>

</html>