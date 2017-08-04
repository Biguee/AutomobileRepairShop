<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Lista napraw</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<table>
    <thead>
    <tr>
        <th>Lp.</th>
        <th>Id</th>
        <th>Nazwa</th>
        <th>Wycena</th>
        <th>Orientacyjny czas naprawy</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${repairList}" var="repair" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${repair.id}</td>
            <td>${repair.repairName}</td>
            <td>${repair.repairCost}</td>
            <td>${repair.repairTime}</td>
            <td><a href="editRepair.html?id=${repair.id}">Edytuj</a></td>
            <td><a href="removeRepair.html?id=${repair.id}">Usun</a></td>
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
    <a href="showRepairMenu.html">
        menu - naprawy
    </a>
</p>
</body>
</html>
