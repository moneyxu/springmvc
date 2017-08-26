<%--
  Created by IntelliJ IDEA.
  User: qianxu
  Date: 2017/8/23
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <fmt:message key="jstl.message.welcome"/>
    <a href="<c:url value="/user/normalSuccess.html"/>">跳转到成功页面</a>
    <p>${user.name}</p>
    <form:form modelAttribute="user">
        用户名：<form:input path="name" cssStyle="color:red;"/><br>
        密码：<form:password path="password"/><br>
        性别：<form:radiobuttons path="gender" items="${gender}" itemLabel="value" itemValue="key"/><br>
        爱好：<form:checkboxes path="fav" items="${fav}"/><br>
        所在城市：<form:select path="city" items="${city}" itemValue="value" itemLabel="label"/><br>
        籍贯：
            <form:select path="hometown">
                <form:option value="" label="--请选择--"/>
                <form:options items="${hometown}" itemLabel="label" itemValue="value"/>
            </form:select><br>
        自我描述：
            <form:textarea path="description" cols="30" rows="2"/><br>
        <input type="submit" value="提交">
    </form:form>
</body>
</html>
