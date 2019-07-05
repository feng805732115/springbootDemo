<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/7
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加信息页面</h1>
<form id="addInfo" action="javascript:;" method="post">
    编号：<input id="deptNo" type="text" name="deptNo"/>
    名字：<input id="deptName" type="text" name="deptName"/>
    位置：<input id="deptLoc" type="text" name="deptLoc"/>
    <input type="submit" value="提交"/>
</form>
<script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
<script src="${pageContext.request.contextPath}/js/addInfo.js"></script>
</body>
</html>
