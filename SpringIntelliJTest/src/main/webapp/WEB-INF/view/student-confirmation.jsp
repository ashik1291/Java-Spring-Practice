
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title> Student Confirmation </title>
</head>
<body>
        Student Details:
        <br>
        Name: ${student.firstName} ${student.lastName}
        <br>
        Country: ${student.country}
        <br>
        Favorite Programming Language: ${student.favoriteLanguage}
        <br>
        OS Experiences:
        <ol>
            <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
            </c:forEach>
        </ol>
</body>
</html>