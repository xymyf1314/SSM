<%@ page language="java" contentType="text/html;utf-8" pageEncoding="utf-8"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>

<body>
<table border="1" cellspacing="0" cellpadding="2" width="70%">
    <tr>
        <td>ID</td>
        <td>UserName</td>
        <td>PWD</td>
        <td>Grade</td>
        <td>PHONE</td>
        <td>ADDR</td>
        <td>RDATE</td>
        <td>DISABLE</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.userPassword}</td>
            <td>${user.userGrade}</td>
            <td>${user.userPhone}</td>
            <td>${user.userAddress}</td>
            <td>${user.userRegisterDate}</td>
            <td>${user.disable}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
