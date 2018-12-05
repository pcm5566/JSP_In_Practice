<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.changmin.Hello" %>
<html>
<body>
<h2>Hello World!</h2>
<%
    out.println("2");
    Hello hello = new Hello();
out.println(hello.name);

%>
</body>
</html>
