<!DOCTYPE HTML>
<html>
	<head>
		<title>ChangePassword</title>
	</head>
	<body>
		<form action="changepassword" method="post">
			<table>
				<tr>
					<th>old Password</th>
					<td>
						<input type="password" name="oldPassword">
					</td>
				</tr>
				<tr>
					<th>New password</th>
					<td>
							<input type="password" name="newPassword">
					</td>
				</tr>
				<tr>
					<th>Confirm password</th>
					<td>
							<input type="password" name="confirmPassword">
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<input type="submit" value="login">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>