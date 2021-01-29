<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
 <form action='register-successful' method = 'POST'>  
        <div class="container">
        	<label>Email : </label>   
            <input type="text" placeholder="Enter Email" name="email" required>     
            <label>Username : </label>   
            <input type="text" placeholder="Enter Username" name="username" required>  
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="password" required>  
            <button type="submit">Register</button>     
        </div>   
    </form>     
</body>
</html>