<%@ page contentType="text/html; charset=Shift_JIS" %>
<html>
	<head>
		<title>input</title>
	</head>
	<body>
        <form method="POST" action="/helloServlet/week/test">
			<%= request.getAttribute( "year" ) %>年
			<%= request.getAttribute( "month" ) %>月
			<%= request.getAttribute( "day" ) %>日は
			<%= request.getAttribute( "week" ) %>曜日
		</form>
	</body>
</html>