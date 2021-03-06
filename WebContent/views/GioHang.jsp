<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html lang="vn">
<head>
<style>
.thanhtoan-row {
	display: flex;
	justify-content: space-around;
}

.tongtien-row {
	display: flex;
	justify-content: end;
}
</style>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Giỏ Hàng</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/SanPham.css">

<script type="text/javascript">
		src="<%=request.getContextPath()%>
	/js/SanPham.js">
</script>
</head>
<body>
	<form action="ShowGioHangServlet" method="post">
		<!-- header -->
		<jsp:include page="Header.jsp" />

		<!-- Body_selling products -->
		<section class="body_product">
			<div class="container">
				<div class="title">
					<h3>Giỏ Hàng</h3>
				</div>
				<div class="show_product">
					<c:forEach items="${listGioHang}" var="sp">
						<div class="card">
							<div class="items">
								<div class="image">
									<img src="<%=request.getContextPath()%>/upload/${sp.tenSP}.jpg">
								</div>
								<div class="text">
									<h3>Tên LapTop: ${sp.tenSP}</h3>
									<p>Giá: ${sp.giaSP} VNĐ</p>
								</div>
								<div class="button">
									<a href="RemoveGioHangServlet?maSP=${sp.maSP}"
										class="btn btn-primary">Remove</a>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
				<hr />
				<br />
				<div class="thanhtoan-row">
					<div>
						<h2><label for="voucher">Voucher: </label> <input id="voucher"
							name="voucher" type="text" placeholder="Input Your Voucher"  style="font-size: smaller;"/></h2>
					</div>
					<div>
						<table border=1>
							<tr>
								<th>Tên Sản Phâmg</th>
								<th>Giá Sản Phẩm</th>
							</tr>
							<c:forEach items="${listGioHang}" var="sp">
								<tr>
									<td>${sp.tenSP}</td>
									<td>${sp.giaSP}VNĐ</td>
								</tr>
							</c:forEach>

						</table>
						<div class="tongtien-row">
							<div>
								<h1>
									Tổng Tiền: ${tongtien} VNĐ <br /> <a
										href="/WebsiteLapTop/ThanhToanServlet">Thanh Toán</a>
								</h1>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>

		<!-- end Body product discount -->
		<jsp:include page="Footer.jsp" />
		<script src="https://kit.fontawesome.com/03bca92048.js"
			crossorigin="anonymous"></script>
	</form>
</body>
</html>
</body>
</html>