<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/7
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${deptList!=null}">
    <h2><a href="${pageContext.request.contextPath}/add">增加</a></h2>
    <table border="1">
    <tr>
        <td>编号：</td>
        <td>名字：</td>
        <td>位置：</td>
        <td>操作</td>
    </tr>
<c:forEach items="${deptList}" var="dept">
       <tr>
           <td>${dept.deptno}</td>
           <td>${dept.dname}</td>
           <td>${dept.loc}</td>
           <td>
               <a>修改</a>
               <a>删除</a>
           </td>
       </tr>
</c:forEach>
    </table>
</c:if>
<div style="width: 342px">
    <span>共${num}页&nbsp;&nbsp;第${pageNum}页</span>
<a id="first" href="javascript:;">首页</a>
    <span>
        <c:if test="${pageNum>1}">
        <a id="prev"href="javascript:;">上一页</a>
        </c:if>
        <c:if test="${pageNum<num}">
        <a id="next" href="javascript:;">下一页</a>
        </c:if>
    </span>
    <a id="last" href="javascript:;">末页</a>
</div>
</body>
<script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js" type="text/javascript"></script>
<script>
    $(document).ready(function () {
      $("#first").click(function () {
          $("body").load("deptList","pageNum=1");
         /* $.ajax({
              url:"deptList",
              data:"pageNum=1",
              type:"GET",
              dataType:"text",
              success:function (data) {
                  $("body").load(data)
              },
              error:function () {
                  alert("请求出错，请联系管理员！")
              }


          })*/
      });
      $("#prev").click(function () {
          $("body").load("deptList","pageNum=${pageNum-1}");
      });
        $("#next").click(function () {
            $("body").load("deptList","pageNum=${pageNum+1}");
        });
        $("#last").click(function () {
            $("body").load("deptList","pageNum=${num}");
        });
    })
</script>
</html>
