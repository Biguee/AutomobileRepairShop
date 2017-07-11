<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit repair</title>
</head>

<body>
<body>
<h1>Edytuj naprawe</h1>
<f:form method="post" modelAttribute="repair">
    <div>Naprawa: </div>
    <f:input path="repairName"/>
    <p>
        <f:errors path="repairName"/>
    </p>
    <div>Koszt naprawy: </div>
    <f:input path="repairCost"/>
    <p>
        <f:errors path="repairCost"/>
    </p>

    <div>Czas naprawy (w godzinach): </div>
    <f:input path="repairTime"/>
    <p>
        <f:errors path="repairTime"/>
    </p>


    <p>
        <button type="submit">Zmien</button>
    </p>
</f:form>

<p>
    <a href="index.html">
        menu glowne
    </a>
</p>
<p>
    <a href="showRepairMenu.html">
        menu - naprawa
    </a>
</p>
</body>

</body>
</html>