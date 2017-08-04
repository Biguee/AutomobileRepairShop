<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Pracownik zostal zmieniony</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<h2>OK!</h2>

<p>
    Imie: ${employee.employeeName}
    Nazwisko: ${employee.employeeSurname}
    Pensja: ${employee.salary}

</p>

<p>
    <a href="index.html">
        Menu glowne
    </a>
</p>
<p>
    <a href="showEmployeeMenu.html">
        menu - pracownicy
    </a>
</p>

</body>
</html>
