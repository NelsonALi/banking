RawBlameHistory     34 lines (33 sloc)  1017 Bytes
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Online Banking Site</title>
	<jsp:include page="./header.jsp"/>
</head>
<body>
	<jsp:include page="./carousel.jsp" />
	<jsp:include page="./menu.jsp" />
	<div class="jumbotron">
		<form class="form-inline" action="Register" method="post">
			<h2>Welcome to join the Online Banking System</h1>
			<table class="table table-condensed">
				<tr>
					<td>
						<div class="form-group">
							<label class="sr-only" for="loginname">Login ID</label> <input type="text" class="form-control"
								id="loginname" placeholder="loginname" name="loginname" required="reguired">
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="form-group">
							<label class="sr-only" for="firstname">Your Firstname</label> <input type="text" class="form-control"
								id="firstname" placeholder="firstname" name="firstname" required="reguired">
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="form-group">
							<label class="sr-only" for="lastname">Login ID</label> <input type="text" class="form-control"
								id="lastname" placeholder="lastname" name="lastname" required="reguired">
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="form-group">
							<label class="sr-only" for="initbalance">Login ID</label> <input type="text" class="form-control"
								id=""initbalance"" placeholder=""initbalance"" name=""initbalance"" required="reguired">
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<button type="submit" class="btn btn-success">Register</button>
					</td>
				</tr>
			</table>
		</form>	
	</div>
</body>
</html>
