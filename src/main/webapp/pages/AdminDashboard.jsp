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
			<li><img src="dashboard.png" alt="">&nbsp;Dashboard</li>
			<li><img src="customers.png" alt="">&nbsp;Customers</li>
			<li><img src="product.png" alt="">&nbsp;Product</li>
			<li><img src="report.png" alt="">&nbsp;Generate Report</li>
			<li><img src="Sign Out.png" alt="">&nbsp;sign out</li>
	
		</ul>
	</div>
	<div class="container">
		<div class="header">
			<div class="nav">
				<div class="search">
					<input type="text" placeholder="Search...">
					<button type="submit"><img src="../images/search.png" alt=""></button>
				</div>
				<div class="user">
					<!-- <a href="#" class="btn"> Add New</a> -->
					<div class="img-case">
						<img src="../images/user.png" alt="">
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
					<h3>Revenue</h3>
				</div>
				<div class="icon-case">
					<img src="../images/sales.png" alt="">
				</div>
			</div>
			<div class="card">
				<div class="box">
					<h1>82</h1>
					<h3>Total Items</h3>
				</div>
				<div class="icon-case">
					<img src="../images/sales.png" alt="">
				</div>
			</div>
			
		</div>
		<div class="content-2">
			<div class="recent-payments"></div>
				<div class="title">
					<h2>Recent Payments</h2>
					<a href="#" class="btn">View All</a>
				</div>
		<div class="new-users"></div>
			
		</div>
	</div>
	</div>
	
		

</body>
</html>