<!-- declaration block-->
<%!
 String name = "Sunil Joseph"; //instance variable
 public int add(int x, int y){
	 return x+y;
 }
%>
<h2>
<%
 out.println("My Name is : "+ name+"<br>");
 out.println("Sum = "+ add(10, 22));
%>
</h2>