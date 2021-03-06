package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.DAO;

@WebServlet("/ThanhToanServlet")
public class ThanhToanServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstlastname = request.getParameter("firstlastname");
		String username = request.getParameter("username");
		String diachi = request.getParameter("diachi");
		String numberphone = request.getParameter("numberphone");
		String genderM = request.getParameter("genderM");
		String genderF = request.getParameter("genderF");
		String nationality = request.getParameter("nationality");
		String noted = request.getParameter("noted");
		String genderCheck = null;
		if (genderM == null && genderF == null)
			genderCheck = "LGBT";
		else if (genderM == null)
			genderCheck = "Female";
		else
			genderCheck = "Male";
		DAO dao = new DAO();
		dao.insertHoaDonBanHang(username, firstlastname, diachi, numberphone, genderCheck, nationality, noted);
		
		request.setAttribute("firstlastname", firstlastname);
		request.setAttribute("diachi", diachi);
		request.setAttribute("numberphone", numberphone);
		request.setAttribute("gender", genderCheck);
		request.setAttribute("nationality", nationality);
		request.setAttribute("noted", noted);
		request.getRequestDispatcher("/views/ThanhToan.jsp").forward(request, response);

	}

}
