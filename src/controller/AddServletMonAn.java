package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.monan_bo;

/**
 * Servlet implementation class AddServletMonAn
 */
@WebServlet("/AddServletMonAn")
public class AddServletMonAn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServletMonAn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//			String destination = null;
//			
//			String MaMonAn = request.getParameter("maMonAn");
//			String TenMonAn = request.getParameter("tenMonAn");
//			String TheLoai = request.getParameter("theloaiMonAn");
//			String Gia = request.getParameter("giaMonAn");
//			String MoTa = request.getParameter("motaMonAn");
//			String Anh = request.getParameter("hinhanhMonAn");
//			
//			monan_bo bo = new monan_bo();
//			bo.addMonAn(MaMonAn, TenMonAn, TheLoai, Gia, MoTa, Anh, "active");
//			destination = "/index.jsp";
//			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
//			response.sendRedirect(destination);
//		} catch (Exception e) 
//		{
//			System.out.println("update error");
//		}
//	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String destination = null;
			
			String MaMonAn = request.getParameter("maMonAn");
			String TenMonAn = request.getParameter("tenMonAn");
			String TheLoai = request.getParameter("theloaiMonAn");
			String Gia = request.getParameter("giaMonAn");
			String MoTa = request.getParameter("motaMonAn");
			String Anh = request.getParameter("hinhanhMonAn");
			
			monan_bo bo = new monan_bo();
			bo.addMonAn(MaMonAn, TenMonAn, TheLoai, Gia, MoTa, Anh, "active");
			request.setAttribute("tenTK","phu");
			request.setAttribute("password","phu");
			destination = "/dangnhap_Servlet";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request,response);
//			response.sendRedirect(destination);
		} catch (Exception e) 
		{
			System.out.println("update error");
		}
	}

}
