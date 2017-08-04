<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edycja klienta</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<body>
<h1>Edytuj klienta</h1>
<f:form method="post" modelAttribute="client">
    <div>Imie: </div>
    <f:input path="clientName"/>
    <p>
        <f:errors path="clientName"/>
    </p>
    <div>Nazwisko: </div>
    <f:input path="clientSurname"/>
    <p>
        <f:errors path="clientSurname"/>
    </p>

    <div>NIP: </div>
    <f:input path="clientNIP"/>
    <p>
        <f:errors path="clientNIP"/>
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
    <a href="showClientMenu.html">
        menu - klienci
    </a>
</p>
</body>

</body>
</html>