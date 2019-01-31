<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Coffee</title>
</head>
<body>

	<h1>------Coffee------</h1>
	<form action="makeCoffee" method="post">
		<label>How many?</label>
		<input type='text' name="noOfCoffee" value='' />
		<input type='submit' value='Make Coffee' />
		<h2>${emptyCoffee}</h2>
		<h2>${displayMessage}</h2>
		<p>${sugar}</p>
		<p>${water}</p>
		<p>${milk}</p>
		<p>${coffeePowder}</p>
		<%-- <br>
		<label>How many?</label> <input type='number' value='coffeeNumber' />
		<input type='submit' value='Make Black Coffee' />
		<h2>${displayMessage}</h2>
		<p>${water}</p>
		<p>${coffeePowder}</p> --%>
	</form>

</body>
</html>