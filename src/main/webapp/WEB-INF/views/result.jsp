<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>登録結果</h2>
	名前 :
	<c:out value="${questionnaire.name }" />
	<br>
	
	<br> メール :
	<c:out value="${questionnaire.email }" />
	<br>
	
	<br>性別 : 
	 <c:out value="${questionnaire.sex }" />
	 <br>
	 
	<br> 趣味 :
	<c:forEach var="hobby" items="${questionnaire.hobbyList }">
		<c:out value="${hobby }" />
		<br>
	</c:forEach>
	<br>
	
	<br>好きな言語 : 
	 <c:out value="${questionnaire.lang }" />
	 <br>
	 
	<br>その他 : 
	 <c:out value="${questionnaire.other }" />

</body>
</html>