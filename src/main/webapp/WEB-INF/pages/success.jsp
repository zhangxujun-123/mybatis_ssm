<%--
  Created by IntelliJ IDEA.
  User: 张旭军
  Date: 2020/8/27
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功页面</title>
</head>
<body>
  <h3>查询所有成功</h3>
  <br>
  <c:forEach items="${success}" var="account">
       ${account.name}
       ${account.money}<br>
  </c:forEach>
  <br>
  ${success}
</body>
</html>
