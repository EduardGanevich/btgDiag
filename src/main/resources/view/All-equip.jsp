<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
    <title>All Equipments</title>
</head>
<body>
<h2>All Equipments</h2>
<br>

<table>
    <tr>
        <th>Name </th>
        <th>Surname </th>
        <th>Department </th>
        <th>Salary </th>
        <th>Operations</th>
    </tr>


    <c:forEach var="equip" items="${equipment}">

<%--        <c:url var = "updateButton" value="/updateInfo">--%>
<%--            <c:param name="empId" value="${emp.id}"/>--%>
<%--        </c:url>--%>
<%--        <c:url var = "deleteButton" value="/delete">--%>
<%--            <c:param name="empId" value="${emp.id}"/>--%>
<%--        </c:url>--%>
        <tr>
        <td>${equip.id}</td>
        <td>${equip.filial}</td>
        <td>${equip.equipment_type}</td>
        <td>${equip.place_of_Install}</td>
<%--            <td><input type="button" value="Update" onclick="window.location.href = '${updateButton}'"/></td>--%>
<%--            <td><input type="button" value="Delete" onclick="window.location.href = '${deleteButton}'"/></td>--%>
<%--        </tr>--%>
    </c:forEach>

</table>
<br><br><br>
<input type="button" value="ADD" onclick="window.location.href = '/addNew'"/>

</body>
</html>
