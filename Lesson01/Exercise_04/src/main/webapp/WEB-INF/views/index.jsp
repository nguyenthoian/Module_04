<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<c:set value="${message}" var="message"></c:set>
<form:form action="/dictionary" modelAttribute="dictionary" method="post">

    nhận từ tiếng anh bạn cần tìm
    <br>
    <form:input path="wordEn" name="wordEn"/>
    <br>
    nghĩa tiếng việt
    <br>
    <form:input path="wordVn" name="wordVn" readonly="true" />
    <br>
    <br>
    <form:input path="result" name="result" readonly="true" cssStyle="border: none; outline: none" />
    <br>
    <button type="submit">Submit</button>
</form:form>
</body>
</html>