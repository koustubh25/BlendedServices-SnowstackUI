package org.controller;
import javax.servlet.http.HttpSession;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.businessServices.LoginServices;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username, password;
		username = request.getParameter("username");
		password= request.getParameter("password");
		LoginServices loginService = new LoginServices();
		HttpSession session =request.getSession();
		System.out.println("inside ");
		boolean result = loginService.authenticate(username, password);
		if(result && username.equals("koustubh"))
		{
			
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			session.setAttribute("searchQuery", "sports technology");
			
			response.sendRedirect("BlendedServices.jsp");
			
			return;
			
		}
		else if(result && username.equals("iori"))
		{
			
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			session.setAttribute("searchQuery", "japan sushi");
			
			response.sendRedirect("BlendedServices.jsp");
			
			return;
			
		}
		if(result && username.equals("shehnaz"))
		{
			
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			session.setAttribute("searchQuery", "asmano pe likha geo tv");
			
			response.sendRedirect("BlendedServices.jsp");
			
			return;
			
		}
		if(result && username.equals("zeeshan"))
		{
			
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			session.setAttribute("searchQuery", "pakistan cars sports");
			
			response.sendRedirect("BlendedServices.jsp");
			
			return;
			
		}
		else
		{
			session.setAttribute("username", "invalid");
			response.sendRedirect("login.jsp");
			return;
		}
		
		// TODO Auto-generated method stub
	}

}
