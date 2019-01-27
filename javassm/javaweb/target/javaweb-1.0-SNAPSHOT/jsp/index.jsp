<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: abi
  Date: 2019/1/26
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello</h1>
    <a href="/index.html">获取表格数据</a>
    <table>
        <thead>
            <tr>
                <td>用户名</td>
                <td>密码</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${userList}" var="user">
                <td>${user.userName}</td>
                <td>${user.password}</td>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
