<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html lang="vn">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Nhân Viên</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/SanPham.css">

<script type="text/javascript">
		src="<%=request.getContextPath()%>
	/js/SanPham.js">
</script>
</head>
<body>
	<form action="NhanVienDB" method="post">
		<!-- header -->
		<jsp:include page="/views/Header.jsp" />
		<section class="body_product">
			<div class="container">
				<div class="title">
					<h3>Nhân Viên</h3>
				</div>
				<div class="show_product">
					<table border=1>
						<tr>
							<th>Mã Nhân Viên</th>
							<th>Họ và Tên</th>
							<th>Ngày Sinh</th>
							<th>Số Điện Thoại</th>
							<th>Quê Quán</th>
							<th>Số Tài Khoản</th>
							<th>Mã Account</th>
							<th>Action</th>
						</tr>
						<c:forEach items="${listNhanVien}" var="nv">
							<tr>
								<td>${nv.maNV}</td>
								<td>${nv.hoTen}</td>
								<td>${nv.ngaySinh}</td>
								<td>${nv.SDT}</td>
								<td>${nv.queQuan}</td>
								<td>${nv.STK}</td>
								<td>${nv.id_Account}</td>
								<td><a href="">Edit</a><a href="">Delete</a></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</section>
		<!-- end Body product discount -->
		<jsp:include page="/views/Footer.jsp" />
		<script src="https://kit.fontawesome.com/03bca92048.js"
			crossorigin="anonymous"></script>
	</form>
</body>
</html>
