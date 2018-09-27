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
    <title>Hello</title>
  </head>
  <body bgcolor="red">
  Content only for adults. Good bye, <%= request.getParameter("first_name")%> <%= request.getParameter("last_name")%>!!!
  </body>
</html>
