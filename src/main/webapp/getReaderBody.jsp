<%--
  Created by IntelliJ IDEA.
  User: pcm5566
  Date: 2018/12/5
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.changmin.GetReaderBody" %>
<html>
<head>
    <title>获取body内容</title>
</head>
<body>
<form action="<%=request.getContextPath()%>GetReaderBody"
 method = "POST">
用户名：<input name="username"/><br/>
    密码：<input name="password" type="password"/><br/>
    <input type="submit" name="user_submit" value="提交"/>
    </form>
</body>
</html>
