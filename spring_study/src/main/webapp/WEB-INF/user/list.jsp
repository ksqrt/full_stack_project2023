<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%--<img src="http://localhost:8080/image/subscribe.png">--%>
<%--<img src="../image/subscribe.png">--%>
<form id = "writeForm">

    <table border =1 id="userTable">
        <tr>
            <th>이름</th>
            <th>아이디</th>
            <th>비밀번호</th>
        </tr>

<%--       동적 처리 --%>
    </table>
    <br> <br>

<%--    검색 창--%>
    <div style="width : 450px ">
        <form id = "searchForm">
            <select id = "searchOption" name = "searchOption">
                <option value="name">이름</option>
                <option value="id">아이디</option>

            </select>
            <input type ="text" id="keyword" name = "keyword">
            <button id = "searchBtn">검색</button>
        </form>

    </div>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type = "text/javascript" src = "../js/list.js"></script>
</form>
</body>
</html>