<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <p>
        수정할 아이디 입력 <input type="text" id ="search-input" placeholder="아이디를입력해주세요">
        <input type = "button" id = "searchIdBtn" value ="검색">
    </p>


<div id = "resultDiv"> </div>
<div id = "updateDiv">
    <form id = "updateForm">
        <style>
            table {
                margin: auto;
            }
        </style>

        <table border =1>
            <tr>
                <td><label for="name">사용자명:</label></td>
                <td><input type="text" id="name" name="name"></td>
            </tr>
            <tr>
                <td><label for="id">아이디</label></td>
                <td><input type="text" id="id" name="id">
                    <div id="idDiv"></div></td>

            </tr>
            <tr>
                <td><label for="pwd">비번:</label></td>
                <td><input type="password" id="pwd" name="pwd"></td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <button value="로그인" id="updateBtn"/>클릭
                    <input type ="reset" value ="취소">
                </td>
            </tr>
        </table>
    </form>

</div>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type = "text/javascript" src = "../js/updateForm.js"></script>
</body>
</html>