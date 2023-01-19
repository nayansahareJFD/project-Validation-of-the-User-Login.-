package com.nayan.sahare;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	
	
	// STORING A PARAMETER FROM HTML PAGE
		String USERID=req.getParameter("userid");
		String PASSWORD=req.getParameter("pass");
		
		
       		
	   // STORING ABOVE DATA IN  HTTP SESSION  
       	HttpSession session=req.getSession();
	
	    session.setAttribute("keyID", USERID);
	    session.setAttribute("keyPASS", PASSWORD);
	//    REDIRECTING ABOVE STORED DATA TO DASHBOARD SERVLET
	    
	    
	    resp.sendRedirect("dashboard");
	
	
	
	
	
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
	

}
