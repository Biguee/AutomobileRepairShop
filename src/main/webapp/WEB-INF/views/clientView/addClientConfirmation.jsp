<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Kontrahent dodany</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<h1>OK!</h1>
<p>
    Dodano nowego kontrahenta:  "${client.clientName}"  "${client.clientSurname}"
</p>

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
