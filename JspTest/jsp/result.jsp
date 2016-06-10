<%@ page contentType="text/html; charset=Shift_JIS" %>
<html>
	<head>
		<title>input</title>
	</head>
	<body>
        <form method="POST" action="/helloServlet/week/test">
			<%= request.getAttribute( "year" ) %>”N
			<%= request.getAttribute( "month" ) %>ŒŽ
			<%= request.getAttribute( "day" ) %>“ú‚Í
			<%= request.getAttribute( "week" ) %>—j“ú
		</form>
	</body>
</html>