<%--
  Created by IntelliJ IDEA.
  User: Nataly
  Date: 11.05.2020
  Time: 1:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring test app</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>Идентификатор</th>
            <th>Имя</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
