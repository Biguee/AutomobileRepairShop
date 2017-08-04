<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<h1>Dodaj nowa naprawe</h1>
<f:form method="post" modelAttribute="repair">
    <p>
        Nazwa: <f:input path="repairName"/>
    <p>
        <f:errors path="repairName"/>
    </p>
    </p>
    <p>
        Koszt naprawy:<f:input path="repairCost"/>
    <p>
        <f:errors path="repairCost"/>
    </p>
    </p>
    <p>
        Orientacyjny czas naprawy (w godzinach):<f:input path="repairTime"/>
    <p>
        <f:errors path="repairTime"/>
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
