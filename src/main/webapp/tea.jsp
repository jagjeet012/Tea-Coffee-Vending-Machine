<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Tea</title>
</head>
<body>
		
	<h1>------Tea------</h1>
	<form action="makeTea" method="post">
		<label>How many?</label>
		<input type='text'  name="noOfTea" value='' />
		<input type='submit' value='Make Tea' />
		<h2>${emptyTea}</h2>
		<h2>${displayMessage}</h2>
		<p>${sugar}</p>
		<p>${water}</p>
		<p>${milk}</p>
		<p>${teaLeaves}</p>
		<%-- <br>
		<label>How many?</label>
		<input type='number' value='teaNumber' />
		<input type='submit' value='Make Black Tea' />
		<h2>${displayMessage}</h2>
		<p>${water}</p>
		<p>${teaLeaves}</p> --%>
	</form>

</body>
</html>