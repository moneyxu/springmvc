<%--
  Created by IntelliJ IDEA.
  User: qianxu
  Date: 2017/7/12
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
    <form method="post" action="<c:url value="user.html"/> ">
        <table>
            <tr>
                <td><input type="text" name="userName"/></td>
            </tr>
            <tr>
                <td><input type="text" name="password"/></td>
            </tr>
            <tr>
                <td><input type="submit" name="提交"/> </td>
            </tr>
        </table>
    </form>
</body>
</html>
