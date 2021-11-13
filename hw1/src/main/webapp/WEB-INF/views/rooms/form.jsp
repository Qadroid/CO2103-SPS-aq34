<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Add Room</title>
</head>

<body>
<form:form action="/addRoom?hotel=${hotel}" modelAttribute="room">

	<form:label path="name">Enter name of room: </form:label>
	<form:input path="name"/>
	<form:errors path="name"/><br/>

	<form:label path="description">Enter description of room: </form:label>
	<form:input path="description"/>
	<form:errors path="description"/><br/>
	
	<form:label path="category">Enter category of room: </form:label>
	<form:input path="category"/>
	<form:errors path="category"/><br/>

	<form:label path="guests">Enter number of guests: </form:label>
	<form:input path="guests"/>
	<form:errors path="guests"/><br/>
	
	<input type="submit"/><form:errors/>
</form:form>
</body>

</html>