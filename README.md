# [java][servlet] 게시판 작성

## 1️⃣ /noticelist

![Untitled](%5Bjava%5D%5Bservlet%5D%20%E1%84%80%E1%85%A6%E1%84%89%E1%85%B5%E1%84%91%E1%85%A1%E1%86%AB%20%E1%84%8C%E1%85%A1%E1%86%A8%E1%84%89%E1%85%A5%E1%86%BC%203cf4f1a7368846fcbdbfb8ec0551b845/Untitled.png)

요약 : /notice.html 에서 받은 post api 를 받아와 db 에 저장

이후 get 하여 db 에 저장된 데이터를 불러와 리스트 형식으로 출력

기능 : 글작성하기 버튼을 클릭하면 /notice.html 로 이동

아래에 페이징을 구현하여 현재 페이지를 쉽게 나타내고 다른 페이지로 쉽게 이동할 수있음

## 2️⃣ /notice.html

![Untitled](%5Bjava%5D%5Bservlet%5D%20%E1%84%80%E1%85%A6%E1%84%89%E1%85%B5%E1%84%91%E1%85%A1%E1%86%AB%20%E1%84%8C%E1%85%A1%E1%86%A8%E1%84%89%E1%85%A5%E1%86%BC%203cf4f1a7368846fcbdbfb8ec0551b845/Untitled%201.png)

요약 : 게시판 글을 작성할수 있는 폼

기능 : 작성하기 버튼을 누르면 form 안의 값들을 /noticelist 링크로 전송 (submit)

다시 작성하기 버튼을 누르면 form 안의 값들을 reset

글 목록 버튼을 누르면 /noticelist 링크로 이동 이때 default 파라미터로 pg=1 지정하여

1페이지의 목록을 불러옵니다.

## 3️⃣ DB 구조

![Untitled](%5Bjava%5D%5Bservlet%5D%20%E1%84%80%E1%85%A6%E1%84%89%E1%85%B5%E1%84%91%E1%85%A1%E1%86%AB%20%E1%84%8C%E1%85%A1%E1%86%A8%E1%84%89%E1%85%A5%E1%86%BC%203cf4f1a7368846fcbdbfb8ec0551b845/Untitled%202.png)

기초적인 게시판의 기능만 구현.
