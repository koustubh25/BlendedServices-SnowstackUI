package org.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class playVideo
 */
@WebServlet("/playVideo")
public class playVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet();
     */
    public playVideo() {
        super();;
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response);
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String vid = request.getParameter("vid");
		request.setAttribute("vid", vid);
		String service = request.getParameter("service");
		request.setAttribute("service", service);
		System.out.print(vid);
		RequestDispatcher view = request.getRequestDispatcher("videoplayer.jsp");  
		view.forward(request,response); 
		//System.out.println("inside");
		//response.sendRedirect("videoplayer.jsp");
		return;
	}



protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

	String vid = request.getParameter("vid");
	System.out.println(vid);
request.setAttribute("vid", vid);
	String service = request.getParameter("service");
	request.setAttribute("service", service);
	System.out.print(vid);
	RequestDispatcher view = request.getRequestDispatcher("videoplayer.jsp");  
	view.forward(request,response); 
	//System.out.println("inside");
	//response.sendRedirect("videoplayer.jsp");
	return;
	
}
}
