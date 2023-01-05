<%--
  Created by IntelliJ IDEA.
  User: My Pc
  Date: 1/5/2023
  Time: 12:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form method="post">
  <div class="mb-3 mt-3">
    <label  class="form-label">Name:</label>
    <input  readonly name="Name" value="${t.getName()}">
  </div>
  <div class="mb-3">
    <label  class="form-label">Date of Birth:</label>
    <input readonly name="Date" value="${t.getDateofBirth()}">
  </div>
  <div class="mb-3 mt-3">
    <label  class="form-label">Address:</label>
    <input   name="Address" value="${t.getAddress()}">
  </div>
  <div class="mb-3">
    <label  class="form-label">Phone Number:</label>
    <input  name="Phone" value="${t.getPhoneNumber()}">
  </div>
  <div class="mb-3 mt-3">
    <label  class="form-label">Email:</label>
    <input  name="Email" value="${t.getEmail()}">
  </div>
  <div class="mb-3">
    <label  class="form-label">Classroom:</label>
    <input  name="Classroom" value="${t.getClassroom()}">
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>
