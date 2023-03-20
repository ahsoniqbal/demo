<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<title>Questions</title>
</head>
<body>
<c:import url="../common/navbar.jsp" />

<div class="container">
	<div class="row">
		<h2>Ask question</h2>
		<div class="col-sm-10">
			<label for="question" class="form-label">Title</label>
			<input type="text" id="question" class="form-control" aria-describedby="questionHelpBlock">
			<div id="questionHelpBlock" class="form-text">
			  Summarize your problem in short.
			</div>
		</div>
	</div>
	
</div>
	
</body>
</html>