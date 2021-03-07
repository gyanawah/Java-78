<%
 String uid = request.getParameter("txtUid");
 pageContext.setAttribute("name", uid, PageContext.SESSION_SCOPE);
%>
<h2>
Hello, <%=uid %>
</h2>
<hr>
<a href="pagecontext2.jsp">Next Page</a>