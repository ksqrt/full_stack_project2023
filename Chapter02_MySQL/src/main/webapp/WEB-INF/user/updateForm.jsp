<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>
	<a href="/">
		<img src="/image/daram1.jpg" width="50" height="50">
	</a>회원정보수정
</h3>
<br>

<p>
	수정할 아이디 입력 : <input type="text" id="searchId" >
	<input type="button" id="searchIdBtn" value="검색">
</p>
<div id="resultDiv"></div>

<div id="updateDiv">
	<form id="updateForm">
			<label>이름:</label>
	        <input type="text" name="name" id="name"><br>
	        <div id="nameDiv"></div>
	        
	        <label>아이디:</label>
	        <input type="text" name="id" id="id" readonly="readonly"><br>
	        	        
	        <label>비밀번호:</label>
	        <input type="password" name="pwd" id="pwd"><br>
	        <div id="pwdDiv"></div>
	        
	        
	        <input type="button" value="수정" id="updateBtn">
	        <input type="reset" value="취소" id="resetBtn">
	</form>
</div>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="../js/update.js"></script>
</body>
</html>

<!-- 검색 버튼을 눌렀을 때 아이디가 없으면 찾고자 하는 아이디가 없습니다. -->


