<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Pracownik dodany</title>
</head>

<body>
<h1>OK!</h1>
<p>
    Dodano nowego pracownika:  ${employee.employeeName}  ${employee.employeeSurname}
</p>

<p>
    <a href="index.html">
        menu glowne
    </a>
</p>
<p>
    <a href="showEmployeeMenu.html">
        menu - pracownicy
    </a>
</p>
</body>
</html>
