<html>
	<head>
		<title>
			Echo from server
		</title>
	</head>
	<body>
		<% 
		String value = request.getParameter("info");// ����ǰ�˱����������
		out.println( "<h3>Your input is  " + value + "<h3>"); 
		%>
	</body>

</html>