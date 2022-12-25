package com.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JDemoServlet
 */
@WebServlet("/test")
public class JDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String pwrd = request.getParameter("password");
		if("priyanka".equals(uname)&& "mule".equals(pwrd)) {
			request.setAttribute("data", uname); //We are sending username to jsp
			RequestDispatcher rd =request.getRequestDispatcher("success.jsp");   //Needs to give a file path
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd =request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
		}
	}

}
