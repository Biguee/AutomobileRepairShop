<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Hard works garage</title>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">

</head>
<body>
<h1>HARD WORKS GARAGE</h1>
<ul>
    <li>
        <a href="showRepairMenu.html">
            Rodzaj naprawy
        </a>
    </li>

    <li>
        <a href="showClientMenu.html">
            Kontrahenci
        </a>
    </li>


    <li>
    <a href="showEmployeeMenu.html">
        Pracownicy
    </a>
    </li>

    <li>
        <a href="showPartMenu.html">
            Katalog czesci
        </a>
    </li>

    <li>
        <a href="showOrderMenu.html">
            Zlecenia naprawy
        </a>
    </li>

</ul>
</body>
</html>