<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<h1>Dodaj nowa naprawe</h1>
<f:form method="post" modelAttribute="repair">
    <p>
        Nazwa: <f:input path="partName"/>
    <p>
        <f:errors path="partName"/>
    </p>
    </p>
    <p>
        Numer katalogowy czesci:<f:input path="partNumber"/>
    <p>
        <f:errors path="partNumber"/>
    </p>
    </p>
    <p>
        Cena hurtowa:<f:input path="priceWholesale"/>
    <p>
        <f:errors path="priceWholesale"/>
    </p>
    </p>
    <p>
        Cena detaliczna:<f:input path="priceRetail"/>
    <p>
        <f:errors path="priceRetail"/>
    </p>
    </p>
    <p>
        Ilosc:<f:input path="amount"/>
    <p>
        <f:errors path="amount"/>
    </p>
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
