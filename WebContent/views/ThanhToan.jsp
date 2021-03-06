<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html lang="vn">
<head>
<script>
	function myFunction() {
		alert("Mua Hàng Thành Công");
	}
</script>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Thanh Toán</title>
</head>
<body>
	<jsp:include page="Header.jsp" />
	<section class="top">
		<header class="container">
			<div class="row">
				<div>
					<h1>Thông Tin Người Nhận</h1>
				</div>
			</div>
		</header>
	</section>
	<section class="menu-login">
		<div class="container">
			<div class="row">
				<div class="col-7">
					<form action="ThanhToanServlet" method="post">
						<!-- Ten nguoi -->
						<div class="form-group">
							<label for="firstlastname">Họ Và Tên Người Nhận:</label> <input
								type="text" id="firstlastname" name="firstlastname"
								class="form-control">
						</div>
						<!-- Ten TK -->
						<div class="form-group">
							<label for="username">User Name:</label> <input type="text"
								id="username" name="username" class="form-control">
						</div>
						<!-- Địa Chỉ -->
						<div class="form-group">
							<label for="diachi">Địa Chỉ:</label> <input type="text"
								id="diachi" name="diachi" class="form-control">
						</div>
						<!-- Number Phone -->
						<div class="form-group">
							<label for="numberphone">Số Điện Thoại:</label> <input
								type="text" id="numberphone" name="numberphone"
								class="form-control">
						</div>
						<!-- Gioi Tinh-->
						<div class="form-group">
							<label for="genderM">Gender:</label>
							<div class="form-check form-check-inline">
								<input type="radio" id="genderM" name="genderM"
									class="form-check-input" /> <label for="genderM">Male</label>
							</div>
							<div class="form-check form-check-inline">
								<input type="radio" id="genderF" name="genderF"
									class="form-check-input" /> <label for="genderF">Female</label>
							</div>
						</div>
						<!-- Quoc Tich-->
						<div class="form-group">
							<label for="nationality">Quốc Tịch:</label> <select
								name="nationality" id="nationality" data-live-search="true"
								class="form-control selectpicker">
								<option data-tokens="Asian" value="VietNam">VietNam</option>
								<option data-tokens="Asian" value="Jpan">Jpan</option>
								<option data-tokens="Asian" value="China">"China"</option>
								<option data-tokens="Asian" value="korean">korean</option>
								<option data-tokens="Asian" value="Campuchia">Campuchia</option>
								<option data-tokens="Asian" value="Indonesia">Indonesia</option>
								<option data-tokens="Europe" value="England">England</option>
								<option data-tokens="Europe" value="Paris">Philippines</option>
								<option data-tokens="Europe" value="American">American</option>
								<option data-tokens="Europe" value="Russia">Russia</option>
							</select>

						</div>
						<!--Ghi Chu-->
						<div class="form-group">
							<label for="noted">noted</label>
							<textarea name="noted" id="noted" rows="3" class="form-control"></textarea>
						</div>
						<hr />
						<button type="submit" class="btn btn-primary">Submit</button>
					</form>
				</div>
				<div class="col-5">
					<h3>Xác Nhận Thông Tin Người Nhận</h3>
					<ul>
						<li>Họ và Tên: ${firstlastname }</li>
						<li>Địa Chỉ: ${diachi }</li>
						<li>numberphone: ${numberphone}</li>
						<li>Gender: ${gender }</li>
						<li>Nationality: ${nationality }</li>
						<li>Noted: ${noted }</li>
					</ul>
					
						<a onclick="myFunction()" href="/WebsiteLapTop/TrangChuServlet">Xác Nhận</a>
				
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="Footer.jsp" />
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"
		integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF"
		crossorigin="anonymous"></script>

</body>
</html>