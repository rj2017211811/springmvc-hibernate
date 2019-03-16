<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/person/save.action" method="post">
		<table>
		
			<tbody>
				
				<tr><th>name:</th><td><input type="text" name="name"></td></tr>
				<tr><th>age:</th><td><input type="text" name="age"></td></tr>
				<tr><td colspan="2"><input type="submit" value="添加"></td></tr>
			
			
			</tbody>
		</table>
	
	
	</form>
	<a href="${pageContext.request.contextPath }">返回</a>
	
</body>
</html>