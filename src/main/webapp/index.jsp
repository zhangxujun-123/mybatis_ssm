<%--
  Created by IntelliJ IDEA.
  User: 张旭军
  Date: 2020/8/27
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springmvc整合spring</title>
</head>
<body>
<a href="account/findAll">测试springmvc</a>
<br>
<br>
<h3>测试保存</h3>
<br>
<form action="account/save" method="post">
    姓名：<input type="text" name="name"/>
    <br>
    金额：<input type="text" name="money"/>
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
