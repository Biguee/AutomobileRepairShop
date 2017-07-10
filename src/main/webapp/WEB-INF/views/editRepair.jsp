<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit repair</title>
</head>

<body>
<body>
<h1>Edytuj zlecenie</h1>
<f:form method="post" modelAttribute="repair">
    <div>Zlecenie: </div>
    <f:input path="repairName"/>
    <p style="font-size:14px; color:deeppink; font-weight:bold; font-style:italic;">
        <f:errors path="repairName"/>
    </p>
    <div>Koszt naprawy: </div>
    <f:input path="repairCost"/>
    <p style="font-size:14px; color:deeppink; font-weight:bold; font-style:italic;">
        <f:errors path="repairCost"/>
    </p>

    <div>Czas naprawy (w godzinach): </div>
    <f:input path="repairTime"/>
    <p style="font-size:14px; color:deeppink; font-weight:bold; font-style:italic;">
        <f:errors path="repairTime"/>
    </p>


    <p>
        <button type="submit">Zmien</button>
    </p>
</f:form>

<p>
    <a href="index.html">
        Back to the main page
    </a>
</p>
<p>
    <a href="showRepairMenu.html">
        menu - pracownicy
    </a>
</p>
</body>

</body>
</html>