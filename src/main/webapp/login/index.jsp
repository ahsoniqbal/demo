<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
   <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Login</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>
</head>
<body>
	
	<div class="container">
      <form class="form-signin" method="post" action="/login">
	        <h2 class="form-signin-heading">Please Login</h2>
				
	    		<c:if test="${param.logout!=null}"><div class="alert alert-success" role="alert">You have been signed out</div></c:if>	
	    		<c:if test="${param.error!=null}"><div class="alert alert-danger" role="alert">Username Or Password Invalid!</div></c:if>
	          
	          <label for="username" class="sr-only">Username</label>
	          <input type="text" id="username" name="username" class="form-control" placeholder="Username" required autofocus>
	        </p>
	        <p>
	          <label for="password" class="sr-only">Password</label>
	          <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
	        </p>
	        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	      </form>
	</div>
</body>
</html>