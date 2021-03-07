<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body style="background-color:lightblue">
<h2>
 <%
  if(exception instanceof ArithmeticException)
	  out.println(exception.toString());
  else if(exception instanceof ArrayIndexOutOfBoundsException)
	  out.println("Invalid Array Index: "+ exception.getMessage());
  else
	  out.println("Internal Server Error!");
 %>
</h2>
</body>
</html>