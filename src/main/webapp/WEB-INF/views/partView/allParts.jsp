<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Lista czesci</title>
</head>

<body>
<table>
    <thead>
    <tr>
        <th>Lp.</th>
        <th>Id</th>
        <th>Nazwa</th>
        <th>Numer katalogowy</th>
        <th>Cena hurtowa brutto</th>
        <th>Cena detaliczna brutto</th>
        <th>Ilosc</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${partList}" var="part" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${part.id}</td>
            <td>${part.partName}</td>
            <td>${part.partNumber}</td>
            <td>${part.priceWholesale}</td>
            <td>${part.priceRetail}</td>
            <td>${part.amount}</td>

            <td><a href="editPart.html?id=${part.id}">Edytuj</a></td>
            <td><a href="removePart.html?id=${part.id}">Usun</a></td>
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
    <a href="showPartMenu.html">
        menu - czesci
    </a>
</p>
</body>
</html>
