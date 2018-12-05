<%--
  Created by IntelliJ IDEA.
  User: pcm5566
  Date: 2018/12/5
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored ="false" %>
<html>
<head>
    <title>Save Product</title>
    <style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h4>The product has been saved.</h4>
    <p>
    <h5>Details:</h5>
    Product Name: ${product.name}<br/>
    Description: ${product.description}<br/>
    Price: ${product.price}

</div>
</body>
</html>
