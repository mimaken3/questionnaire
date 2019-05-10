<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>ユーザ登録フォーム</h2>
	<form:form modelAttribute="questionnaireForm"
		action="${pageContext.request.contextPath }/create">
名前 : <br>
		<form:input path="name" />
		<br>
メール : <br>
		<form:input path="email" />
		<br>
		
		性別：<br>
		<form:radiobutton path="sex" label="男" value="男" />
		<form:radiobutton path="sex" label="女" value="女" />
		<br>
		<br>
        
趣味 : <br>
		<form:checkboxes path="hobbyList" items="${hobbyMap }" delimiter=" " />
		<br>
		<br>
        
        好きな言語 : <br>
		<form:select path="lang">
			<form:options items="${langList}" />
		</form:select>
		<br>
		<br>
		
	 その他 : <br>
		<form:textarea path="other" rows="5" cols="30" />
		<br>

		<input type="submit" value="登録">
	</form:form>


</body>
</html>