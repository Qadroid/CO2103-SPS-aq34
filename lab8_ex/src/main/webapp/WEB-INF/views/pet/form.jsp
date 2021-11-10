<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<form:form action = "/showPet" modelAttribute = "pet" method="POST">
		<form:input type = "text" path = "name"/>
        <form:select path = "species">
            <form:option value = "dog"/>
            <form:option value = "cat"/>
            <form:option value = "bird"/>
        </form:select>
		<input type = "submit"/>
	</form:form>
</body>
</html>