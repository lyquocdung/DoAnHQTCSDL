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
<title>Nhà Cung Cấp</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/SanPham.css">

<script type="text/javascript">
		src="<%=request.getContextPath()%>
	/js/SanPham.js">
</script>
</head>
<body>
	<form action="NhaCungCapDB" method="post">
		<!-- header -->
		<jsp:include page="/views/Header.jsp" />
		<section class="body_product">
			<div class="container">
				<div class="title">
					<h3>Nhà Cung Cấp</h3>
				</div>
				<div class="show_product">
					<table border=1>
						<tr>
							<th>Mã Nhà Cung Cấp</th>
							<th>Tên Nhà Cung Cấp</th>
							<th>Địa Chỉ</th>
							<th>Số Điện Thoại</th>
							
							<th>Action</th>
						</tr>
						<c:forEach items="${listNhaCungCap}" var="ncc">
							<tr>
								<td>${ncc.maNCC}</td>
								<td>${ncc.tenNCC}</td>
								<td>${ncc.diaChi}</td>
								<td>${ncc.dienThoai}</td>
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
