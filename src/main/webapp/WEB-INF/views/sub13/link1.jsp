<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<h1>고객 목록</h1>
	<table class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>ContactName</th>
				<th>Address</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${customerList }" var="list">
				<tr>
					<td>${list.customerId }</td>
					<td>${list.customerName }</td>
					<td>${list.contactName }</td>
					<td>${list.address }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="container">
		<div class="row justify-content-center">
			<nav aria-label="Page navigation example">
				<ul class="pagination">
					<c:if test="${prevPageNumber ge 1}">
						<li class="page-item">
							<c:url value="/sub26/link1" var="pageLink">
								<c:param name="page" value="1"></c:param>
							</c:url>
							<a class="page-link" href="${pageLink }">&lt&lt</a>
						</li>
						<li class="page-item">
							<c:url value="/sub26/link1" var="pageLink">
								<c:param name="page" value="${prevPageNumber }"></c:param>
							</c:url>
							<a class="page-link" href="${pageLink }">&lt</a>
						</li>
					</c:if>
					<c:forEach begin="${leftPageNumber }" end="${rightPageNumber }" var="pageNumber">
						<c:if test="${pageNumber le lastPageNumber}">
							<c:url value="/sub26/link1" var="pageLink">
								<c:param name="page" value="${pageNumber }"></c:param>
							</c:url>
							<li class="page-item">
								<a class="page-link ${pageNumber eq currentPageNumber ? 'active' : '' }" href="${pageLink }" >${pageNumber }</a>
							</li>
						</c:if>
					</c:forEach>
					<c:if test="${nextPageNumber le lastPageNumber}">
						<li class="page-item">
							<c:url value="/sub26/link1" var="pageLink">
								<c:param name="page" value="${nextPageNumber}"></c:param>
							</c:url>
							<a class="page-link" href="${pageLink }">&gt</a>
						</li>
						<li class="page-item">
							<c:url value="/sub26/link1" var="pageLink">
								<c:param name="page" value="${lastPageNumber}"></c:param>
							</c:url>
							<a class="page-link" href="${pageLink }">&gt&gt</a>
						</li>
					</c:if>
				</ul>
			</nav>
		</div>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>