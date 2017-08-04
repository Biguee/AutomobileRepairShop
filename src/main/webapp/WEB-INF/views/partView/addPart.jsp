<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hard Works Garage</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<h1>Dodaj nowa czesc do katalogu</h1>
<f:form method="post" modelAttribute="part">
    <div>Nazwa: </div>
    <f:input path="partName"/>
    <p>
        <f:errors path="partName"/>
    </p>
    <div>Numer katalogowy: </div>
    <f:input path="partNumber"/>
    <p>
        <f:errors path="partNumber"/>
    </p>

    <div>Cena hurtowa brutto: </div>
    <f:input path="priceWholesale"/>
    <p>
        <f:errors path="priceWholesale"/>
    </p>


    <div>Ilosc: </div>
    <f:input type = "number" path="amount"/>
    <p>
        <f:errors path="amount"/>
    </p>

    <button type="submit">Dodaj</button>

</f:form>
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
