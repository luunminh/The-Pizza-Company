package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.monan;
import model.bo.monan_bo;
import model.dao.monan_dao;

/**
 * Servlet implementation class testAdminServlet
 */
@WebServlet("/testAdminServlet")
public class testAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		monan_bo bo = new monan_bo();
		ArrayList<monan> listMonAn = bo.getAllMonAnPizzaActive();
		request.setAttribute("listMonAn",listMonAn);
		ArrayList<monan> listPastaMonAn = bo.getAllMonAnPastaActive();
		request.setAttribute("listPastaMonAn",listPastaMonAn);
		ArrayList<monan> listSaladMonAn = bo.getAllMonAnSaladActive();
		request.setAttribute("listSaladMonAn",listSaladMonAn);
		String destination = "/index.jsp";
		System.out.println("xuat");
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		monan_bo bo = new monan_bo();
		ArrayList<monan> listMonAn = bo.getAllMonAnPizzaActive();
		request.setAttribute("listMonAn",listMonAn);
		ArrayList<monan> listPastaMonAn = bo.getAllMonAnPastaActive();
		request.setAttribute("listPastaMonAn",listPastaMonAn);
		ArrayList<monan> listSaladMonAn = bo.getAllMonAnSaladActive();
		request.setAttribute("listSaladMonAn",listSaladMonAn);
		String destination = "/index.jsp";
		System.out.println("xuat");
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request,response);
	}

}
