<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tbody >

			<tr>
				<th>id</th>
				<th>name</th>
				<th>age</th>
				<th>删除</th>
				<th>修改</th>
			
			</tr>
			<c:forEach items="${personList }" var="person">
				<tr>
					<td>${person.id }</td>
					<td>${person.name }</td>
					<td>${person.age }</td>
					<td><a href="${pageContext.request.contextPath }/person/delete.action?id=${person.id }">删除</a>
					<td><a href="${pageContext.request.contextPath }/person/toUpdate.action?id=${person.id }">修改</a>
				
				</tr>

			</c:forEach>

		</tbody>
	</table>
	<a href="${pageContext.request.contextPath }">返回</a>
</body>
</html>