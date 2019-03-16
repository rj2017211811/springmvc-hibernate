<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!--<sf:form action="${pageContext.request.contextPath }/person/saveOrUpdate.action" method="post" modelAttribute="person" enctype="multipart/form-data">
		<table>
			<tbody>

				<tr>
					<td>id</td>
					<td>name</td>
					<td>file</td>
					
				</tr>

				<tr>
					<td><sf:input path="id"  /></td>
					<td><sf:input path="name" /></td>
					<td><input type="file" name="photoPath"></td>

				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交"></td>
				</tr>

			</tbody>

		</table>

	</sf:form>-->
	<form action="${pageContext.request.contextPath }/person/update.action" method="post" modelAttribute="person" enctype="multipart/form-data">
		<table>
			<tbody>

				<tr>
					<td>id</td>
					<td>name</td>
			        <td>age</td>
					
				</tr>

				<tr>
					<td><input name="id"  value="${person.id }" readonly="readonly"/></td>
					<td><input name="name"  value="${person.name }"/></td>
					<td><input name="age"  value="${person.age }"/></td>
	
					

				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交"></td>
				</tr>

			</tbody>

		</table>

	</form>
	<a href="${pageContext.request.contextPath }/person/listAll.action">返回</a>

</body>
</html>