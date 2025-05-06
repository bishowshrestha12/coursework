<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<link rel="stylesheet" href="./AdminDashboard.css">
</head>
<body>
	<div class="side-menu">
		<div class="brand-name">
			<h1>Rakshi Pasal</h1>
		</div>
		<ul>
			<li><img src="dashboard.png" alt="">&nbsp;<span>Dashboard</span></li>
			<li><img src="customers.png" alt="">&nbsp;<span>Customers</span></li>
			<li><img src="product.png" alt="">&nbsp;<span>Product</span></li>
			<li><img src="report.png" alt="">&nbsp;<span>Generate Report</span></li>
			<li><img src="Sign Out.png" alt="">&nbsp;<span>sign out</span></li>
	
		</ul>
	</div>
	<div class="container">
		<div class="header">
			<div class="nav">
				<div class="search">
					<input type="text" placeholder="Search...">
					<button type="submit"><img src="../images/search1.png" alt=""></button>
				</div>
				<div class="user">
					<!-- <a href="#" class="btn"> Add New</a> -->
					<div class="img-case">
						<a href="#"><img src="../images/user.png" alt=""></a>
					</div>
				</div>
				
			</div>
		
		</div>
			<div class="content">
		<div class="cards">
			<div class="card">
				<div class="box">
					<h1>82</h1>
					<h3>Sales</h3>
				</div>
				<div class="icon-case">
					<img src="../images/sales.png" alt="">
				</div>
			</div>
			<div class="card">
				<div class="box">
					<h1>215</h1>
					<h3>Total Users</h3>
				</div>
				<div class="icon-case">
					<img src="../images/user11.png" alt="">
				</div>
			</div>
			<div class="card">
				<div class="box">
					<h1>82</h1>
					<h3>Total Items</h3>
				</div>
				<div class="icon-case">
					<img src="../images/items1.png" alt="">
				</div>
			</div>
			
		</div>
		<div class="content-2">
			<div class="recent-payments">
				<div class="title">
					<h2>Recent Payments</h2>
					<a href="#" class="btn">View All</a>
				</div>
				<table>
					<tr>
						<th>Name</th>
						<th>Item</th>
						<th>Total price</th>
						<th>Option</th>
						
					</tr>	
					<tr>
						<td>Dishant Giri</td>
						<td>Khukuri Rum</td>
						<td>$512</td>
						<td><a href="#" class="btn">View</a>
						
					</tr>	
				</table>
			</div>
				
		<div class="new-users">
			<div class="title">
					<h2>Recent Users</h2>
					<a href="#" class="btn">View All</a>
				</div>
				<table>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Role</th>
						<th>Option</th>
						
					</tr>	
					<tr>
						<td>1</td>
						<td>Dishant Giri</td>
						<td>Super Admin</td>
						<td><a href="#" class="btn">View</a>
						
					</tr>	
				</table>
		</div>
			
		</div>
	</div>
</div>
	
		

</body>
</html>