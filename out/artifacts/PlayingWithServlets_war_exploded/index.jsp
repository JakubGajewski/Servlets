<%--
  Created by IntelliJ IDEA.
  User: jagaj
  Date: 26.09.2018
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  Hej ho!
  <a href="/zupa">zwykle</a>
  <a href="/lupa">teraz</a>

  </br>
  What is your name?

  <form action="${pageContext.request.contextPath}/age" method = "GET">
    First Name: <input type = "text" name = "first_name">
    <br />
    Last Name: <input type = "text" name = "last_name" />
    <br />
    Age: <input type = "text" name = "age" />
    <input type = "submit" value = "Submit" />
  </form>
  </body>
</html>


