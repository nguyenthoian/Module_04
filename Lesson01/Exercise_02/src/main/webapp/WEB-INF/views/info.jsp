<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/01/2024
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="customer" value="${cus}"></c:set>
<form action="/customer/list" method="post">
   <div>
       <table border="1">
           <tr>
               <th>Id</th>
               <td >
                   <input id="id" name="id" type="hidden" value=" ${customer.getId()}">
                   ${customer.getId()}
               </td>
           </tr>
           <tr>
               <th>Name</th>
               <td>
                   <input id="name" name="name" type="text" value=" ${customer.getName()}">
               </td>
           </tr>
           <tr>
               <th>Email</th>
               <td>
                   <input id="email"  name="email" type="text" value=" ${customer.getEmail()}">
               </td>
           </tr>
           <tr>
               <th>Address</th>
               <td>
                   <input id="address" name="address" type="text" value="${customer.getAddress()}">

               </td>
           </tr>
           <tr>
               <td>
               <button type="submit">Update</button>
               </td>
               <td></td>
           </tr>
       </table>
   </div>
</form>
</body>
</html>
