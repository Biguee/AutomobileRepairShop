<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Klient edytowany</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<h2>OK!</h2>

<p>
    Imie: ${client.clientName}
    Nazwisko: ${client.clientSurname}
    nip: ${client.clientNIP}

</p>

<p>
    <a href="index.html">
        Menu glowne
    </a>
</p>
<p>
    <a href="showClientMenu.html">
        menu - klienci
    </a>
</p>

</body>
</html>
