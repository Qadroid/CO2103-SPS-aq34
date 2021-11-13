<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Add Hotel</title>
</head>

<body>
<form:form action="/addHotel" modelAttribute="hotel">
	<form:label path="id">Enter ID of hotel: </form:label>
	<form:input path="id"/>
	<form:errors path="id"/><br/>

	<form:label path="name">Enter name of hotel: </form:label>
	<form:input path="name"/>
	<form:errors path="name"/><br/>
	
	<form:label path="description">Enter description of Hotel: </form:label>
	<form:input path="description"/>
	<form:errors path="description"/><br/>

	<input type="submit"/><form:errors/>
</form:form>
</body>

</html>