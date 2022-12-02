package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.bean.nguoidung;
import model.bo.nguoidung_bo;
import model.dao.nguoidung_dao;
/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServletNguoiDung")
public class AddServletNguoiDung extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServletNguoiDung() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String destination=null;
			String MaNguoiDung = request.getParameter("maND");
			String TenNguoiDung = request.getParameter("tenND");
			String SoDienThoai = request.getParameter("SDT");
			String PhanQuyen = request.getParameter("phanQuyen");
			String DiaChi = request.getParameter("diaChi");
		
			nguoidung_bo bo = new nguoidung_bo();
			bo.addNguoiDung(MaNguoiDung,TenNguoiDung,SoDienThoai,DiaChi,PhanQuyen);
			destination = "/index.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request,response);
		} catch (Exception e) {
			System.out.println("update error");
		}
	}
}