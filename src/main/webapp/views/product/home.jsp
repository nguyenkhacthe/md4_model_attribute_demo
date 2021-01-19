<%--
  Created by IntelliJ IDEA.
  User: jimmyng
  Date: 1/18/2021
  Time: 4:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo</title>
</head>
<body>
<h1>Goodbye World</h1>
<h3>What is your last whisper?</h3>
<form method="post" action="/home">
    <input type="text" name="id" value="${product.id}" />
    <input type="text" name="name" value="${product.name}" />
    <button type="submit">Click</button>
</form>
</body>
</html>
