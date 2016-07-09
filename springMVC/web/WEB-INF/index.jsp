<%--
  Created by IntelliJ IDEA.
  User: wjk
  Date: 16/7/8
  Time: 下午6:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请登录</title>
</head>
<body>
<h5>this is index.jsp</h5>
<form action="/user/index" method="post">
    <p>用户名：</p><input type="text" id="username" name="username">
    <p>密码：</p><input type="password" id="password" name="password">
    <p><input type="submit" value="提交"></p>
</form>
</body>
</html>