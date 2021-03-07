<%@page errorPage="handler.jsp" %>
<%!
 int x=10, y=10, z=0;
 int[] marks = new int[7];
%>
<h2>
<%
 z = x/y;
if(y==0)	
 out.println("Result = "+ z+"<br>");
 out.println(marks[7]);
%>