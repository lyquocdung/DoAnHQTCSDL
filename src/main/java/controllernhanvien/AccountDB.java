package controllernhanvien;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import dao.DAONHANVIEN;
import model.Account;
import model.GioHang;
import model.HoaDonBanHang;
import model.NhanVien;

@WebServlet("/AccountDB")
public class AccountDB extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DAONHANVIEN dao = new DAONHANVIEN();
		List<Account> list = dao.getAllAccount();
		request.setAttribute("listAccount", list);
		
		request.getRequestDispatcher("/viewsnhanvien/AccountDB.jsp").forward(request, response);
	}

}
