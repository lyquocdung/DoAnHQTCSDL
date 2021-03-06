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
import model.GioHang;
import model.HoaDonBanHang;
import model.NhanVien;
import model.ThongTinUuDai;

@WebServlet("/ThongTinUuDaiDB")
public class ThongTinUuDaiDB extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DAONHANVIEN dao = new DAONHANVIEN();
		List<ThongTinUuDai> list = dao.getAllThongTinUuDai();
		request.setAttribute("listThongTinUuDai", list);
		
		request.getRequestDispatcher("/viewsnhanvien/ThongTinUuDaiDB.jsp").forward(request, response);
	}

}
