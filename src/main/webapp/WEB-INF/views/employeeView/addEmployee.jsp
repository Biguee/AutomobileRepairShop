<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<h1>dodaj nowego pracownika</h1>
<f:form method="post" modelAttribute="employee">
    <p>
        Imie: <f:input path="employeeName"/>
    <p>
        <f:errors path="employeeName"/>
    </p>
    </p>
    <p>
        Nazwisko:<f:input path="employeeSurname"/>
    <p>
        <f:errors path="employeeSurname"/>
    </p>
    </p>
    <p>
        Pensja:<f:input path="salary"/>
    <p>
        <f:errors path="salary"/>
    </p>
    </p>
    <button type="submit">Dodaj</button>

</f:form>
<p>
    <a href="index.html">
        Menu glowne
    </a>
</p>
<p>
    <a href="showEmployeeMenu.html">
        menu - pracownicy
    </a>
</p>

</body>
</html>
