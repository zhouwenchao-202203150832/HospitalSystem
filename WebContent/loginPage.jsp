<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
    <link rel="stylesheet" href="styles/login_style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .login-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            width: 300px;
            text-align: center;
        }
        .form-input {
            margin-bottom: 15px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            width: 100%;
            box-sizing: border-box;
            transition: border-color 0.3s ease-in-out;
        }
        .form-input:focus {
            border-color: #85b7d9;
        }
        .primary-button {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .primary-button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="login-container animate__animated animate__fadeInDown">
    <h2>用户登录</h2>
    <form name="UserLogin" action="login" method="post" >
        <div class="form-input">
            <input type="text" name="username" placeholder="工号或学号" class="form-input">
            ${errorMessage1}
        </div>
        <div class="form-input">
            <input type="password" name="password" placeholder="密码" class="form-input">
            ${errorMessage2}
        </div>
        <div class="form-input">
        	<h3>请选择您的身份：</h3>
   			<select name="role">
       		<option value="patient">病人</option>
        	<option value="doctor">医生</option>
        	<option value="admin">管理员</option>
    		</select>
        </div>
        <button type="submit" name="submit" class="primary-button">登录</button>
    </form>
</div>
</body>
</html>