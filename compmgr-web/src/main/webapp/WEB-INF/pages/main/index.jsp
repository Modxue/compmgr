<%--
  Created by IntelliJ IDEA.
  User: zouguo
  Date: 2018/7/31
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<style type="text/css">
		* {
			margin: 0;
			padding: 0;
		}

		a {
			text-decoration: none;
		}
		/* #wrap{
				background-color:pink;
				height: 100vh;
				width:100vw;
			} */

		#main {
			height: 100vh;
		}

		#main img {
			height: 76vh;
			width: 100vw;
			margin-top: 12vh;
			z-index: 1;
			position: absolute;
		}

		#login {
			background-color: white;
			height: 60vh;
			width: 25vw;
			z-index: 2;
			position: absolute;
			margin-left: 65vw;
			margin-top: 20vh;
			opacity: 0.8;
			border-radius: 2vw;
			font-family: "微软雅黑";
			text-align: center;
		}

		#login-title {
			font-size: 4vh;
			padding-top: 8vh;
		}

		#login-form {
			padding-top: 5vh;
			line-height: 5vh;
			font-size: 1.4vw;
		}

		#main-login-button {
			display: flex;
		}

		.login-input {
			width: 10vw;
			height: 3vh;
		}

		.login-button {
			background-color: #000000;
			color: #FFFFFF;
			height: 5vh;
			width: 6vw;
			padding-top: 1.5vh;
			opacity: 0.9;
			margin-left: 4vw;
			border-radius: 1vw;
			cursor: pointer;
		}
	</style>
</head>

<body>
	<div id="main">
		<img src="${pageContext.request.contextPath}/images/login.jpg">
		<div id="login">
			<div id="login-title">密码登录</div>
			<form id="login-form">
				<div>
					账号：
					<input type="text" class="login-input" id="input1"/>
				</div>
				<div>
					密码：
					<input type="password" class="login-input"  id="input2"/>
				</div>

				<br>
				<br>
			</form>
			<div id="main-login-button">
				<div class="login-button" id="login-btn">
					登录
				</div>
				<div class="login-button" id="register-btn">
					注册
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	var loginData;
	$.ajax({
			async: false,
			type: "GET",
			url: "${pageContext.request.contextPath}/json/login.json",
			dataType: "json",
			contentType: "application/json;charset=utf-8",
			success: function (data) {
					loginData = data;
			},
			error: function (data) {
					alert("数据读取失败。");
			}
	});
	function isRight(){
		var loginId=$("#input1").val();
		var loginPWD=$("#input2").val();
		for(var i=0,j=loginData.length;i<j;i++){
			if(loginId==loginData[i].id&&loginPWD==loginData[i].password){
				alert("成功");
				return;
			}
		}
		alert("失败");
	}
	$("#login-btn").click(function(){
		isRight();
	});
</script>
</html>
