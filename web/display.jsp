<!--print the variables names !-->
<%
  String user=request.getParameter("txtUser");
  out.print(user);
 %>
<!-- or simply-->
${txtUser}



<!-- Print the variable using JSP-->
<%=user%>
<!--receive the extra variable in jsp page--!>
${requestScope.course}
<!--or -->
${course}