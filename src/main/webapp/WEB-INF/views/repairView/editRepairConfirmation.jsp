<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Naprawa zostala zmieniona</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<h2>OK!</h2>

<p>
    Nazwa naprawy: ${repair.repairName}
    Koszt: ${repair.repairCost}
    Orientacyjny czas naprawy: ${repair.repairTime} h

</p>

<p>
    <a href="index.html">
        Menu glowne
    </a>
</p>
<p>
    <a href="showRepairMenu.html">
        menu - naprawa
    </a>
</p>

</body>
</html>
