<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
		<h1>메뉴 등록 페이지</h1>
		<form action="" method="post">
			<fieldset>
				<legend>메뉴 입력 필드</legend>
				<div>
					<label>제목 : </label>
					<input type="text" name="title">
				</div>
				
				<div>
					<input type="submit" value="등록">
				</div>				
			</fieldset>
		</form>
		
		<form action="/upload" method="post" enctype="multipart/form-data"> <!-- 인코딩할때 URL이 아닌 멀티타잉으로 보내줘야함 -->
			<fieldset>
				<legend>사진 입력 필드</legend>
				<div>
		
					<input type="file" name="imgs">
				</div>
				<div>
		
					<input type="file" name="imgs">
				</div>
				
				<div>
					<input type="submit" value="업로드">
				</div>				
			</fieldset>
		</form>
	</section>
</body>
</html>