<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="bobcurrie.playground.util.Mappings" %>

<html>
<head>
    <title>ToDo Items</title>
</head>
<body>
    <div align="center">
    <c:url var="addUrl" value="${Mappings.ADD_ITEM}"/>
    <a href="${addUrl}">New Item</a>

        <table border="1" cellpadding="5">
            <caption><h2>ToDo Items</h2></caption>

            <tr>
                <th>Title</th>
                <th>Deadline</th>
                <th>View</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>

            <c:forEach var="item" items="${toDoData.items}">

                <c:url var="editUrl" value="${Mappings.ADD_ITEM}">
                    <c:param name="id" value="${item.id}" />
                </c:url>

                <c:url var="viewUrl" value="${Mappings.VIEW_ITEM}">
                                    <c:param name="id" value="${item.id}" />
                                </c:url>

                <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
                                    <c:param name="id" value="${item.id}" />
                                </c:url>

                <tr>
                    <td><c:out value="${item.title}"/></td>
                    <td><c:out value="${item.deadline}"/></td>
                    <td><a href="${viewUrl}">View Item</a></td>
                    <td><a href="${editUrl}">Edit</a></td>
                    <td><a href="${deleteUrl}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>