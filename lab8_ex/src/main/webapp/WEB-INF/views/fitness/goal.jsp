<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<form:form action = "/addGoal" modelAttribute = "goal" method="POST">
		<form:label path="id">Goal ID: </form:label><form:input type = "number" path = "id"/>
        <form:label path="minutes">Minutes: </form:label><form:input type = "number" path = "minutes"/>
        <label path="exerciseDesc">Exercise Description: <input name = "exerciseDesc"/></label>
		<input type = "submit"/>
	</form:form>
</body>
</html>