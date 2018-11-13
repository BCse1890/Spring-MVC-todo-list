<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="bobcurrie.playground.util.Mappings" %>

<html>
<head>
    <title>ToDo List Application</title>
</head>
<body>
    <div align="center">
        <c:url var="itemsLink" value="${Mappings.ITEMS}" />
        <h2><a href="${itemsLink}">Show ToDo Items</a></h2>
    </div>
</body>
</html>