<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<h1>dodaj nowego kontrahenta</h1>
<f:form method="post" modelAttribute="client">
    <p>
        Imie: <f:input path="clientName"/>
    <p>
        <f:errors path="clientName"/>
    </p>
    </p>
    <p>
        Nazwisko:<f:input path="clientSurname"/>
    <p>
        <f:errors path="clientSurname"/>
    </p>
    </p>
    <p>
        Nip:<f:input path="clientNIP"/>
    <p>
        <f:errors path="clientNIP"/>
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
    <a href="showclientMenu.html">
        menu - kontrahenci
    </a>
</p>

</body>
</html>
