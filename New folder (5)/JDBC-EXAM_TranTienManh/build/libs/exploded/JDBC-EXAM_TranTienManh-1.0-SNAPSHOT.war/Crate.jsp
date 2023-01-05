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
<form action="/Crate" method="post">
  <div class="mb-3 mt-3">
    <label  class="form-label">Name:</label>
    <input   name="Name">
  </div>
  <div class="mb-3">
    <label  class="form-label">Date of Birth:</label>
    <input  name="Date">
  </div>
  <div class="mb-3 mt-3">
    <label  class="form-label">Address:</label>
    <input  name="Address">
  </div>
  <div class="mb-3">
    <label  class="form-label">Phone Number:</label>
    <input  name="Phone">
  </div>
  <div class="mb-3 mt-3">
    <label  class="form-label">Email:</label>
    <input  name="Email">
  </div>
  <div class="mb-3">
    <label  class="form-label">Classroom:</label>
    <input  name="Classroom">
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>
