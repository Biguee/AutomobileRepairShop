<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Lista pracownikow</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<table>
    <thead>
    <tr>
        <th>Lp.</th>
        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>pensja</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeeList}" var="employee" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${employee.id}</td>
            <td>${employee.employeeName}</td>
            <td>${employee.employeeSurname}</td>
            <td>${employee.salary}</td>
            <td><a href="editEmployee.html?id=${employee.id}">Edytuj</a></td>
            <td><a href="removeEmployee.html?id=${employee.id}">Usun</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
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
</html>
