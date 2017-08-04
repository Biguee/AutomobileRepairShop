<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Naprawa dodana</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<h1>OK!</h1>
<p>
Dodano nowa naprawe  "${repair.repairName}"
</p>

<p>
    <a href="index.html">
        menu glowne
    </a>
</p>
<p>
    <a href="showRepairMenu.html">
        menu - naprawy
    </a>
</p>
</body>
</html>
