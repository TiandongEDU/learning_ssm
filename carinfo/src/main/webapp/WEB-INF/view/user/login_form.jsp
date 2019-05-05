<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Insert title here</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<div align="center">
			<h1>用户登陆</h1>
			<form action="<%=request.getContextPath() %>/user/login.do" method="post">
				<table border="1" style="width: 300px;height:100px ">
					<tr>
						<td align="right">登录名:</td>
						<td>
							<input type="text" id="cellphone" name="cellphone" placeholder="请填写手机号码"/>
						</td>
					</tr>
					<tr>
						<td align="right">密码:</td>
						<td>
							<input type="password" id="password" name="password" placeholder="请填写登陆密码"/>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<button type="submit">登陆</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>