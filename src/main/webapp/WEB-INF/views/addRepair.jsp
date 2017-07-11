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
        Nazwa: <f:input path="repairName"/>
    <p>
        <f:errors path="repairName"/>
    </p>
    </p>
    <p>
        Cost:<f:input path="repairCost"/>
    <p>
        <f:errors path="repairCost"/>
    </p>
    </p>
    <p>
        Time:<f:input path="repairTime"/>
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
    <a href="showRepairMenu.html">
        menu - naprawy
    </a>
</p>
</body>
</html>
