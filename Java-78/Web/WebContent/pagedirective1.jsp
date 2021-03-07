<%@page import="java.util.Date" info="JSP Directive Examples" %>
<%!
 Date today = null;
%>
<h2>
<%
 today = new Date();
 out.println(today);
%>
<hr>
<%
 out.println(getServletInfo());
%>
</h2>