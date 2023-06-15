<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>길동이의 홈페이지</h1>
<%
//스크립트 렛 - JAVA 문법을 사용 가능한 영역이다.
//JSP 파일은 실행 하면 Servlet 파일로 변경 된 후 Tomcat(컨테이너)에서 실행 된다.
//즉, 최종 결과물은 Servlet클래스이다.
String name = "홍길동";
out.println(name+ "님 안녕하세요!");
%>

<!-- 스크립렛 외부에서는 HTML 문법 사용 -->
<ul>
<li><a href ="list.do">사람 목록</a></li>
</ul>

</body>
</html>