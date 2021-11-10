<!DOCTYPE html> 
<%@ taglibprefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en"> 
<head> 
    <meta charset="UTF-8"> 
</head> 
<body>
    <c:forEach (items = "goals" var = "goal")>
        <c:forEach (items = "goal.exercises" var = "exercise")/>
            <c:out value = "${exercise.activity} for ${exercise.minutes}" />
        </c:forEach>
    </c:forEach>
</body> 
</html> 