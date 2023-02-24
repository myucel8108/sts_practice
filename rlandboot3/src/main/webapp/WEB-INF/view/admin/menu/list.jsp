<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin 메뉴 목록 페이지</title>
</head>
<body>
   <h1>list 페이지 입니다.</h1>
   <nav>
      <h1>페이저</h1>
      <form action="">
      	<label>size:</label>
      	<!-- 변수명을 10개로 하고 기본값을 10으로 -->
      	<!-- <input name="s" value="10"> -->
      	<select name="s">
      		<option value="10">10</option>
      		<option value="20">20</option>
      		<option value="50">50</option> 		
      	</select>
      	<input type="submit" value="변경">
      </form>
      <ul>
      <c:forEach var="n" begin="1" end="5">
         <li><a href="list?p=${n}&q=hello">${n}</a></li>
      </c:forEach>
      </ul>
   </nav>
</body>
</html>