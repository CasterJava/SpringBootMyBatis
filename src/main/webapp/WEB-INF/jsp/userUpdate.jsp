<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/user/update" method="post">
    <input type="hidden" name="id" value="${user.id}">
    姓名：<input type="text" name="name" value="${user.name}" ><br>
    <input type="submit" value="修改"><br>
</form>
</body>
</html>
