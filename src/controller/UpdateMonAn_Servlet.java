package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.monan;
import model.bo.monan_bo;

/**
 * Servlet implementation class UpdateMonAn_Servlet
 */
@WebServlet("/UpdateMonAn_Servlet")
public class UpdateMonAn_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMonAn_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String maMonAn = request.getParameter("maMonAn");
			System.out.println("test");
			monan_bo bo = new monan_bo();
			System.out.println("test");
			monan monAn = bo.GetMonAnByID(maMonAn);
			System.out.println("test");
			request.setAttribute("monAn",monAn);
			request.getRequestDispatcher("/UpdateMonAn.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.println("error");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String maMonAn = request.getParameter("maMonAn");
			System.out.println("test");
			monan_bo bo = new monan_bo();
			System.out.println("test");
			monan monAn = bo.GetMonAnByID(maMonAn);
			System.out.println("test");
			request.setAttribute("monAn",monAn);
			request.getRequestDispatcher("/UpdateMonAn.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}
