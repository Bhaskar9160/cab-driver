<!DOCTYPE HTML>
<html>
	<head>
		<title>Registration</title>
	</head>
	<body>
		<form action="reg" method="post">
			<table>
				<tr>
					<th>DriverId</th>
					<td>
						<input type="number" name="driverId">
					</td>
				</tr>
				<tr>
					<th>firstName</th>
					<td>
						<input type="text" name="fullName">
					</td>
				</tr>
				<tr>
					<th>lastName</th>
					<td>
						<input type="text" name="lastName">
					</td>
				</tr>
				<tr>
					<th>emailId</th>
					<td>
						<input type="email" name="emailId">
					</td>
				</tr>
				<tr>
					<th>password</th>
					<td>
							<input type="password" name="password" required minlength="8" maxlength="10">
					</td>
				</tr>
				<tr>
					<th>mobileNumber</th>
					<td>
						<input type="tel" name="mobileNumber">
					</td>
				</tr>
				<tr>
					<th>status</th>
					<td>
						<input type="text" name="status">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="registration">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>