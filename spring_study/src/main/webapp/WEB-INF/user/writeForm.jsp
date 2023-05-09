<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
<style type="text/css">
    #writeForm div{
        color : red;
        font-size : 8pt;
        font-weight : bold;
    }
</style>
</head>

<body>
    <form id = "writeForm">
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
                <td colspan="2" align="center"><button value="로그인" id="writeBtn"/>클릭</td>
            </tr>
        </table>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script type = "text/javascript" src = "../js/writeForm.js"></script>
    </form>
</body>
</html>