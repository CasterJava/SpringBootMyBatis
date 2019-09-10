<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}"  var="ctx"></c:set>
<html>
<head>
    <title>Title</title>
</head>
<body>

<ul>

     <table border="1px" width="300px">
         <tr>
             <td>编号</td>
             <td>年龄</td>
             <td>操作</td>
         </tr>
         <c:forEach items="${lists}" var="user" >
         <tr>
             <td>${user.id}</td>
             <td>${user.name}</td>
             <td>
                 <a href="${ctx}/user/dell/${user.id}">删除</a>
                 <a href="${ctx}/user/findByid/${user.id}">修改</a>
                 <a href="${ctx}/user/go">添加</a>
             </td>

         </tr>
         </c:forEach>
     </table>


</ul>
</body>
</html>
