<%@ page language = "java" %>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>UA Travellers</title>
  <link rel="stylesheet" href="./register.css">

</head>
<body>
<!DOCTYPE html>
<html>
<head>
	<title>Register</title>
	<link rel="stylesheet" type="text/css" href="slide navbar style.css">
	<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
</head>
<body>
	<div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">
			<div class="signup">
				<form name= "signup" onsubmit="return validate()" action= "signup" method="post" >
					<label for="chk" aria-hidden="true">Sign up</label>
					<input type="text" name="name" id="name" placeholder="User name" onchange="name_validate()">
					<input type="email" name="email" id ="email" placeholder="Email" onchange="email_validate()">
					<input type="password" name="password" id="password" placeholder="Password" onblur="pass_validate()">
					<input type="password" name="cnfrmpassword"  id="cnfrmpassword" placeholder="Confirm Password" onblur="match_pass()">
					<span id="errcnfrmpass"></span>
					<select id="module" name="module" required="">
						<option value ="" default hidden placeholder= >Select Option</option>
							<option value="customer">Customer</option>
								<option value="serviceProvider">Service Provider</option>
					</select>
					<input type="submit" name="" placeholder="Signup">
				</form>
			<script src="signup.js"></script>	
			</div>

			<div class="login">
				<form action="signin" method="post" >
					<label for="chk" aria-hidden="true">Login</label>
					<input type="email" name="email" id ="email" placeholder="Email" required="">
					<input type="password" name="password" id="password" placeholder="Password" required="">
					<select id="module" name="module" required="">
						<option value ="" default hidden placeholder= >Select Option</option>
							<option value="customer">Customer</option>
								<option value="serviceProvider">Service Provider</option>
					</select>
					<input type="submit" name="" placeholder="Login">
				</form>
			</div>
	</div>
</body>
</html>  
</body>
</html>
