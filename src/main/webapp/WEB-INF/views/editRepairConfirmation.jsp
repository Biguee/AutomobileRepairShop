<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Repair edited</title>
</head>

<body>
<h2>OK!</h2>

<p>
    Title: ${repair.repairName}
    Cost: ${repair.repairCost}
    Time: ${repair.repairTime}

</p>

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
</html>
