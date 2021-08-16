<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TestMVC</title>
<style>
    input {
       width : 20%;
    }

    label {
       margin : 20px;
    }

    .btn {
      border : none;
      padding : 5px ;
      background-color : #64C9CF;
      color : #ffffff;
      margin : 20px;
    }

    .btn:hover {
      background-color : #53B8BE;
    }
</style>
</head>
<body>
 	<form action="addAlien" method="POST">
 		<label for="aid">Enter your id : </label><input type="text" name="aid"><br>
        <label for="aname">Enter your name : </label><input type="text" name="aname"><br>
 		<input class = "btn" type="submit">
 	</form>
</body>
</html>