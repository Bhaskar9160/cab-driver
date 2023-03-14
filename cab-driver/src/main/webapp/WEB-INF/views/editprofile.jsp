<!DOCTYPE HTML>
<html>
	<head>
		<title>UpdateProfile</title>
	</head>
	<body>
		<form action="editprofile" method="post">
			<table>
				<tr>
					<th>driverId</th>
					<td>
						<input type="number" name="driverId" readonly="readonly" value="${AUTH_DRIVER.driverId}">
					</td>
				</tr>
				<tr>
					<th>firstName</th>
					<td>
						<input type="text" name="firstName" value="${AUTH_DRIVER.firstName}">
					</td>
				</tr>
				<tr>
					<th>lastName</th>
					<td>
						<input type="text" name="lastName" value="${AUTH_DRIVER.lastName}">
					</td>
				</tr>
				<tr>
					<th>emailId</th>
					<td>
						<input type="email" name="emailId" readonly="readonly" value="${AUTH_DRIVER.emailId}">
					</td>
				</tr>
				<tr>
					<th>password</th>
					<td>
							<input type="password" name="password" readonly="readonly" value="${AUTH_DRIVER.password}">
					</td>
				</tr>
				<tr>
					<th>mobileNumber</th>
					<td>
						<input type="tel" name="mobileNumber" value="${AUTH_DRIVER.mobileNumber}">
					</td>
				</tr>
				<tr>
					<th>status</th>
					<td>
						<input type="text" name="status" value="${AUTH_DRIVER.status}">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="update">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>