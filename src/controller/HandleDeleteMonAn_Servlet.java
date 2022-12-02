package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.monan_bo;

/**
 * Servlet implementation class HandleDeleteMonAn_Servlet
 */
@WebServlet("/HandleDeleteMonAn_Servlet")
public class HandleDeleteMonAn_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleDeleteMonAn_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String maMonAn = request.getParameter("maMonAn");
			System.out.println("delete ma mon an: "+ maMonAn);
			monan_bo bo = new monan_bo();
			bo.DeleteMonAn(maMonAn);
			request.setAttribute("tenTK","phu");
			request.setAttribute("password","phu");
			request.getRequestDispatcher("/testAdminServlet").forward(request, response);
		} catch (Exception e) {
			System.out.println("error when handle delete"+ e);
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//			String maMonAn = request.getParameter("maMonAn");
//			System.out.println("delete ma mon an: "+ maMonAn);
//			monan_bo bo = new monan_bo();
//			bo.DeleteMonAn(maMonAn);
////			request.setAttribute("tenTK","phu");
////			request.setAttribute("password","phu");
//			request.getRequestDispatcher("/index.jsp").forward(request, response);
//		} catch (Exception e) {
//			System.out.println("error when handle delete"+ e);
//		}
//	}
	}
}
