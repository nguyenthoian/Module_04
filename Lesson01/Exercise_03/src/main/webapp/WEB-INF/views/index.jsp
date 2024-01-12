<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="table" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form:form action="/changePrice" method="post" modelAttribute="money">
    <table >
        <tr>
            <td>Số USD bạn muốn chuyển dổi</td>
            <td><form:input path="amountUsd" type="text" name="amountUsd"/></td>
        </tr>
        <br>
        <tr>
            <td>Tỷ giá</td>
            <td><form:input path="changePrice" type="text" name="changePrice"/></td>
        </tr>
        <tr>
            <td>
                Sau khi quy đổi thành VND
            </td>
            <td>
                <form:input path="amountVnd" type="text" name="amountVnd"/>
            </td>
        </tr>
        <tr >
            <td rowspan="2">
                <button type="submit">Submit</button>
            </td>
        </tr>
    </table >
</form:form>
</body>
</html>