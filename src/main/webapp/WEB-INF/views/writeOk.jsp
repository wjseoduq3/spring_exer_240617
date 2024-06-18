<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 작성글 확인</title>
</head>
<body>
	<h3>[게시판 작성글 확인]</h3>
	<hr>
	<!-- 글쓴이 : ${blogDto.name}<br>
		글제목 : ${blogDto.title}<br>
		글내용 : ${blogDto.contents} -->
		글쓴이 : ${bdto.name}<br>
		글제목 : ${bdto.title}<br>
		글내용 : ${bdto.contents}
</body>
</html>