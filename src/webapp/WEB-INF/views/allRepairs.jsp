<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Repairs list</title>
</head>

<body>
<table>
    <thead>
    <tr>
        <th>Lp.</th>
        <th>Id</th>
        <th>Name</th>
        <th>Repair cost</th>
        <th>Repair time</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${repairList}" var="repair" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${repair.id}</td>
            <td>${repair.repair_name}</td>
            <td>${repair.repair_time}</td>
            <td><a href="editRepair.html?id=${repair.id}">Edit</a></td>
            <%--<td><a href="removeRepair.html?id=${repair.id}">Remove</a></td>--%>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/">Main menu</a>
</body>
</html>
