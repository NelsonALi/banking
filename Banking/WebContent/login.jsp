<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Online Banking Site</title>
<jsp:include page="./header.jsp" />
</head>
<body>
	<jsp:include page="./carousel.jsp" />
	<jsp:include page="./menu.jsp" />
<div class="container">
  <div class="jumbotron">
    <h1>Online Shopping store</h1>      
  </div>
	<form role="form" action = "Login" method = "post">
	${message}
    <div class="form-group">
      <label for="loginname"></label>
      <input type="text" class="form-control" id="user" name="loginname" placeholder="Enter login name" name="loginname">
    </div>
<!--      <div class="form-group">
      <label for="address"></label>
      <input type="password" class="form-control" id="pwd" name="pwd" placeholder="Enter password">
    </div>
 -->
    <button type="submit" class="btn btn-default">Login</button>
    </form>       

</div>
</body>
</html>
