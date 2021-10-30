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
	align-items: center;
	justify-content: center;
}

.buttonquyen {
	font-size: x-large;
	margin: 2%;
}

a {
	text-decoration: none;
}
</style>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home Page Nhân Viên</title>
</head>
<body>
	<form action="HomePageDB" method="post">
		<jsp:include page="/views/Header.jsp" />
		<!-- header -->
		<section class="body_product">
			<div class="container">
				<div class="row">
					<h1>Chào Mừng Nhân Viên Hãy Chọn Bảng Bạn Muốn Quản Lý!</h1>
				</div>
				<div class="row">
					<div>
						<button class="buttonquyen"
							style="background-color: blanchedalmond;" onclick="location.href='http://localhost:8080/WebsiteLapTop/HoaDonBanHangDB'"
							type="button">Hóa Đơn Bán Hàng</button>
							
							
						<button class="buttonquyen" style="background-color: aquamarine; " onclick="location.href='http://localhost:8080/WebsiteLapTop/HoaDonDatHangDB'"
							type="button">
							Hóa Đơn Đặt Hàng
						</button>
						<button class="buttonquyen" style="background-color: chartreuse;"onclick="location.href='http://localhost:8080/WebsiteLapTop/NhaCungCapDB'"
							type="button">
							Nhà Cung Cấp
						</button>
						<button class="buttonquyen" style="background-color: darkorange;" onclick="location.href='http://localhost:8080/WebsiteLapTop/ThongTinSanPhamDB'"
							type="button">
							Thông Tin Sản Phẩm
						</button>
						<button class="buttonquyen" style="background-color: lightsalmon;" onclick="location.href='http://localhost:8080/WebsiteLapTop/ThongTinUuDaiDB'"
							type="button">
							Thông Tin Ưu Đãi
						</button>
						<button class="buttonquyen" style="background-color: fuchsia;" onclick="location.href='http://localhost:8080/WebsiteLapTop/AccountDB'"
							type="button">
							Account
						</button>
						<button class="buttonquyen" style="background-color: lightblue;" onclick="location.href='http://localhost:8080/WebsiteLapTop/KhachHangDB'"
							type="button">
							Khách Hàng
						</button>
						<button class="buttonquyen" style="background-color: red;" onclick="location.href='http://localhost:8080/WebsiteLapTop/NhanVienDB'"
							type="button">
							Nhân Viên
						</button>
					</div>
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
