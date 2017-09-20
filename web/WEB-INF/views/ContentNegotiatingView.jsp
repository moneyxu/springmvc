<%--
  Created by IntelliJ IDEA.
  User: qianxu
  Date: 2017/9/20
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${userList}" var="item">
        <c:out value="${item.name}"/>
        <c:out value="${item.age}"/>
    </c:forEach>
</body>
</html>
