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
 * Servlet implementation class HandleUpdateMonAn
 */
@WebServlet("/HandleUpdateMonAn")
public class HandleUpdateMonAn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleUpdateMonAn() {
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
			String destination = null;
			
			String MaMonAnUpdate = request.getParameter("maMonAn");
			String TenMonAn = request.getParameter("tenMonAn");
			String TheLoai = request.getParameter("theloaiMonAn");
			String Gia = request.getParameter("giaMonAn");
			String MoTa = request.getParameter("motaMonAn");
			String Anh = request.getParameter("hinhanhMonAn");
			
			monan_bo bo = new monan_bo();
			bo.updateMonAn(MaMonAnUpdate, TenMonAn, TheLoai, Gia, MoTa, Anh);
			//System.out.println(MaMonAn + " " + TenMonAn + " " + TheLoai + " " + Gia + " " + MoTa + " " + Anh + " " + TrangThai);
			destination = "/index.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request,response);
		} catch (Exception e) 
		{
			System.out.println("update error");
		}
	}

}
