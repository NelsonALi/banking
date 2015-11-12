<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Online Banking Site</title>
<jsp:include page="./header.jsp" />
</head>
<body>
	<jsp:include page="./carousel.jsp" />
	<jsp:include page="./menu.jsp" />
	<div class="jumbotron"></div>
	<form role="form" action="BankingApp" method="post">
		<%-- 	${message}
	<h2> You have to login or register first. </h2>	
	  --%>
		<div class="form-group">
			<label for="loginname"></label> <input type="text"
				class="form-control" id="loginname" placeholder="Enter Your ID"
				name="loginname">
		</div>
		<div class="form-group">
			<label for="Changeamount "></label>
			<input type="text" class="form-control" id="changeamount"
				name="changeamount" placeholder="Enter balance change, withdraw use negative value, ex: -800.99.">
		</div>

		<button type="submit" class="btn btn-default">Make Balance
			Change</button>
	</form>
	</div>
</body>
</html>