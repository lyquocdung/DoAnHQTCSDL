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
<title>Thông Tin Sản Phẩm</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/SanPham.css">

<script type="text/javascript">
		src="<%=request.getContextPath()%>
	/js/SanPham.js">
</script>
</head>
<body>
	<form action="ThongTinSanPhamDB" method="post">
		<!-- header -->
		<jsp:include page="/views/Header.jsp" />
		<section class="body_product">
			<div class="container">
				<div class="title">
					<h3>Thông Tin Sản Phẩm</h3>
				</div>
				<div class="show_product">
					<table border=1>
							<tr>
								<th>Mã Sản Phẩm</th>
								<th>Tên Sản Phẩm</th>
								<th>Giá Sản Phẩm</th>
								<th>Thời Gian Bảo Hành</th>
								<th>Xuất Xứ</th>
								<th>Thông Số</th>
								<th>Số Lượng Tồn</th>
								<th>Action</th>
							</tr>
							<c:forEach items="${listThongTinSanPham}" var="ttsp">
								<tr>
									<td>${ttsp.maSP}</td>
									<td>${ttsp.tenSP}</td>
									<td>${ttsp.giaSP}</td>
									<td>${ttsp.thoiGianBaoHanh}</td>
									<td>${ttsp.xuatXu}</td>
									<td>${ttsp.thongSo}</td>
									<td>${ttsp.soLuongTon}</td>
									<td><a href="">Edit</a><a href="">Delete</a> </td>
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
