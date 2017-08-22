<%--
  Created by IntelliJ IDEA.
  User: qianxu
  Date: 2017/8/22
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>注册错误</title>
    <style>
        .error{
            color:red;
        }
    </style>
</head>
<body>
    <form:form modelAttribute="register" action="/api/validate/userRegister">
        <from:errors path="*"/>
        <table>
            <tr>
                <td>用户名：</td>
                <td>
                    <form:errors path="userName" cssClass="error"/>
                    <form:input path="userName"/>
                </td>
            </tr>
            <tr>
                <td>密码：</td>
                <td>
                    <form:errors path="password" cssClass="error"/>
                    <form:input path="password"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交">
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
