<%--
  Created by IntelliJ IDEA.
  User: qianxu
  Date: 2017/9/26
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
    <form action="uploadFile" method="post" enctype="multipart/form-data">
        <input type="file" name="file"/>
        <input type="submit" value="commit">
    </form>
</body>
</html>
