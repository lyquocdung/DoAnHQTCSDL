<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html lang="vn">
<head>
<style>
.row {
	display: flex;
}

table, td {
	border: 1px solid #CCC;
	border-collapse: collapse;
}
</style>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/ChiTietSanPham.css">
<title>Chi Tiết Sản Phẩm</title>
</head>
<body>
	<form action="ChiTietSanPhamServlet" method="post">
		<jsp:include page="Header.jsp" />
		<section class="SanPham">
			<div class="container">
				<div class="Detail-tenSP">Tên Sản Phẩm: ${ctsp.tenSP}</div>
				<hr />
				<div class="row">
					<div class="HinhSanPham">
						<div class="image">
							<img
								src="<%=request.getContextPath()%>/upload/${ctsp.tenSP }.jpg"
								alt="">
						</div>
					</div>
					<div class="Detail">
						<br />
						<table>
							<tr>
								<td>
									<div class="Detail-giaSP">Giá Sản Phẩm: ${ctsp.giaSP }
										Đồng</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="Detail-thoiGianBaoHanh">Thời Gian Bảo Hành
										${ctsp.thoiGianBaoHanh } năm</div>
							</tr>
							<tr>
								<td><div class="Detail-xuatXu">Made in ${ctsp.xuatXu }</div></td>
							</tr>
							<tr>
								<td><div class="Detail-thongSo">Thông Số Kỹ Thuật:
										${ctsp.thongSo }</div></td>
							</tr>
							<tr>
								<td><div class="Detail-soLuongTon">Số Lượng Còn:
										${ctsp.soLuongTon }</div></td>
							</tr>
						</table>
					</div>
				</div>
				<div>
					<h1>aaaaaaaaaaaaaa</h1>
				</div>
			</div>
		</section>
		<jsp:include page="Footer.jsp" />
	</form>
</body>
</html>