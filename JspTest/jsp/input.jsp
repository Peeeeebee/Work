<%@ page contentType="text/html; charset=Shift_JIS" %>

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<title>input</title>
	</head>
	<body>
        <form method="POST" action="/JspTest/week/test">
			<input type="text" name="year" size="6">年
			<input type="text" name="month" size="6">月
			<input type="text" name="day" size="6">日は
			<input type="submit" value="何曜日？">
		</form>
	</body>
</html>