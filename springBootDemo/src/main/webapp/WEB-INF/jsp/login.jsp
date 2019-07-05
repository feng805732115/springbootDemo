<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/8
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/doLogin">
    登录名：<input type="text" name="loginName"/>
    密码：<input type="password" name="password"/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
