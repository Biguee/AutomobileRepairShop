<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Lista kontrahentow</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<table>
    <thead>
    <tr>
        <th>Lp.</th>
        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>NIP</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${clientList}" var="client" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${client.id}</td>
            <td>${client.clientName}</td>
            <td>${client.clientSurname}</td>
            <td>${client.clientNIP}</td>
            <td><a href="editClient.html?id=${client.id}">Edytuj</a></td>
            <td><a href="removeClient.html?id=${client.id}">Usun</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p>
    <a href="index.html">
       menu glowne
    </a>
</p>
<p>
    <a href="showClientMenu.html">
        menu - kontrahenci
    </a>
</p>
</body>
</html>
