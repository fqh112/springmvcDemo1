<%--
  Created by IntelliJ IDEA.
  User: 方启豪
  Date: 2019/8/19
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="show5.do" method="post">
    用户名<input type="text" name="username"/></br>
    用密码<input type="text" name="password"/></br>
    爱好:篮球<input type="checkbox" name="hobby" value="basketball"/>
    足球<input type="checkbox" name="hobby" value="football"/>
    网球<input type="checkbox" name="hobby" value="tennis"/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
