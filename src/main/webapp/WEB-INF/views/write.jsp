<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
	<h3>게시판 글쓰기</h3>
	<hr>
	<form action="writeOk" method="get">
	<table border="1" cellspacing="0" cellpadding="0" width="600">
		<tr>
			<td>이름</td>
			<td><input type="text" size="60" name="name"></td>	
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" size="60" name="title"></td>	
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="10" cols="45" name="contents"></textarea></td>	
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="게시글작성">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>