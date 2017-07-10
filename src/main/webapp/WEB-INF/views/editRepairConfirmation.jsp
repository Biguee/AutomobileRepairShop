<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Repair edited</title>
</head>

<body>
<h2>OK!</h2>

<p>
    Title: ${repair.repair_name}
    Cost: ${repair.repair_cost}
    Time: ${repair.repair_time}

</p>

<p>
    <a href="index.html">
        Back to the main manu
    </a>
</p>

</body>
</html>
