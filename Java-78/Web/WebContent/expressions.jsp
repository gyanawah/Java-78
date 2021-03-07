<!-- declaration block-->
<%!
 String name = "Sunil Joseph"; //instance variable
 public int add(int x, int y){
	 return x+y;
 }
%>
<h2>
My Name is: <%=name %>
<br>
<%="Sum = "+ add(11,34) %>
</h2>