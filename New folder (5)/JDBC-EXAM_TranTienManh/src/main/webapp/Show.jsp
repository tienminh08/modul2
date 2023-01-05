<%--
  Created by IntelliJ IDEA.
  User: My Pc
  Date: 1/4/2023
  Time: 11:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>


<div class="container mt-3">


    <a type="button"  class="btn btn-dark" href="/Crate">Create</a>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Name</th>
            <th>Date of Birth</th>
            <th>Address</th>
            <th>Phone Number</th>
            <th>Email</th>
            <th>Classroom</th>
        </tr>
        </thead>
        <tbody>


        <c:forEach var="p" items="${ListStundet}">
            <tr>
                <td>${p.getName()}</td>
                <td>${p.getDateofBirth()}</td>
                <td>${p.getAddress()}</td>
                <td>${p.getPhoneNumber()}</td>
                <td>${p.getEmail()}</td>
                <td>${p.getClassroom()}</td>
                <td>

                    <a type="button" href="/Edit?id=${p.getId()}" class="btn btn-light">Edit</a>
                </td>
                <td>
                    <a type="button" href="/Delete?id=${p.getId()}" class="btn btn-light">Delete</a>
                </td>


            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
<input>
</body>
</html>
