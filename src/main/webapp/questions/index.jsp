<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script><title>Questions</title>
</head>
<body>
<c:import url="../common/navbar.jsp" />

	<div class="container">
		<c:forEach items="${questions}" var="que" >
		<div class="row my-2">
			<div class="col-sm-6">
			    <div class="card">
			      <div class="card-body">
			        <%-- <h5 class="card-title"><c:out value="${que.title}"></c:out></h5> --%>
			        <p class="card-title"><c:out value="${que.question}"></c:out></p>
			       <p class="float-right"><fmt:formatDate type="date" value="${que.postedAt}"></fmt:formatDate></p> 
			      </div>
			    </div>
			  </div>
		</div>
		</c:forEach>
	</div>

</body>
</html>