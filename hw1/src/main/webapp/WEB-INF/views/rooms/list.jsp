<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Rooms</title>
</head>

<body>

    <h2>Hotel ${hotelId}</h2>

	<c:forEach items="${rooms}" var="room">
	    <h3>Room ${room.name}</h3>
        <p>Room Description: ${room.description}</p>
        <p>Room Category: ${room.category}</p>
	</c:forEach>

    <c:url value = "/newRoom" var = "newRoom">
        <c:param name = "hotel" value = "${hotelId}"/>
    </c:url>

    <a href="${newRoom}">Add Room</a>

</body>

</html>