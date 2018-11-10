<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ToDo Items</title>
</head>
<body>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>ToDo Items</h2></caption>

            <tr>
                <th>Title</th>
                <th>Deadline</th>
            </tr>

            <c:forEach var="item" items="${toDoData.items}">

                <tr>
                    <td><c:out value="${item.title}"/></td>
                    <td><c:out value="${item.deadline}"/></td>
                <tr/>
            </c:forEach>
        </table>
    </div>
</body>
</html>