package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import model.GioHang;

/**
 * Servlet implementation class ShowGioHangServlet
 */
@WebServlet("/ShowGioHangServlet")
public class ShowGioHangServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DAO dao = new DAO();
		List<GioHang> list = dao.getAllGioHang();
		request.setAttribute("listGioHang", list);
		double tongtien = 0;
		for (GioHang o : list) {
			tongtien = tongtien + o.getGiaSP();
		}
		request.setAttribute("tongtien", tongtien);
		request.getRequestDispatcher("/views/GioHang.jsp").forward(request, response);
	}

}
