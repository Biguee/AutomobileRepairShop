<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edycja pracownika</title>
</head>

<body>
<body>
<h1>Edytuj pracowika</h1>
<f:form method="post" modelAttribute="employee">
    <div>Imie: </div>
    <f:input path="employeeName"/>
    <p>
        <f:errors path="employeeName"/>
    </p>
    <div>Nazwisko: </div>
    <f:input path="employeeSurname"/>
    <p>
        <f:errors path="employeeSurname"/>
    </p>

    <div>Pensja: </div>
    <f:input path="salary"/>
    <p>
        <f:errors path="salary"/>
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
    <a href="showEmployeeMenu.html">
        menu - pracownicy
    </a>
</p>
</body>

</body>
</html>