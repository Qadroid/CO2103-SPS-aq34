<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hotels</title>
</head>

<body>

	<c:forEach items="${hotels}" var="hotel">
	    <h3>Hotel ${hotel.id}</h3>
        <p>Hotel Name: ${hotel.name}</p>
        <p>Hotel Description: ${hotel.description}</p>
        <a href="/rooms?hotel=${hotel.id}">Hotel Rooms</a>
	</c:forEach>

</body>

</html>