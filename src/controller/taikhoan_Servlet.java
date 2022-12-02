package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.taikhoan;
import model.bo.taikhoan_bo;

/**
 * Servlet implementation class taikhoan_Servlet
 */
@WebServlet("/taikhoan_Servlet")
public class taikhoan_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public taikhoan_Servlet() {
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
String destination = null;
		
		String tenTK = request.getParameter("tenTK");
		String password = request.getParameter("password");
		System.out.println(tenTK);
		System.out.println(password);
		taikhoan_bo checkBO = new taikhoan_bo();
		ArrayList<taikhoan> taikhoanList = null;
	
		
		
		if(checkBO.isValidUser(tenTK,password)) {
			taikhoanList  = checkBO.getAllTaiKhoan();
		
			
			request.setAttribute("taikhoanList",taikhoanList);
			destination = "updateUser/.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			System.out.println("xuat");
			rd.forward(request,response);
			
		}else {
			destination = "/login.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			System.out.println("test2");
			rd.forward(request,response);
		}
	}
	}


