<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit repair</title>
</head>

<body>
<h1>Edit repair</h1>
<f:form method="post" modelAttribute="repair" action="repair.html">
    <f:hidden path="id"/>
    <p>
        Name:<f:input path="repair_name"/>
    <p>
        <f:errors path="repair_name"/>
    </p>
    </p>
    <p>
        Cost:<f:input path="repair_cost"/>
    <p>
        <f:errors path="repair_cost"/>
    </p>
    </p>
    <p>
        Time:<f:input path="repair_time"/>
    <p>
        <f:errors path="repair_time"/>
    </p>
    </p>
    <button type="submit">Edit</button>
</f:form>

<p>
    <a href="index.html">
        Back to the main page
    </a>
</p>

</body>
</html>