package com.nayan.sahare;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		
		
	               PrintWriter out=resp.getWriter();
	                resp.setContentType("text/html");

	                   HttpSession session1=req.getSession();
	                 String USERNAME= (String) session1.getAttribute("keyID");
	                      HttpSession session=req.getSession(false);
			
			if(session!=null) {
				session.invalidate();
				out.println("<BR>");
				out.println("<BR>");
				out.println("<BR>");
				out.println("<BR>");
	
				
				
				out.print("<h3>User"+"  "+USERNAME+"   "+" Loggedout Successfully</h3>");
				
				
			}
			else {
				out.print("Kindly Login First");
			}
			
			
			out.println("<BR>");
			out.println("<BR>");
			out.println("<BR>");out.println("<BR>");out.println("<BR>");out.println("<BR>");
			out.println("<h3><a href='index.html'> go back to  home page</a></h3>" );
			
    		}  
	      
	     
		
		
		
		

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(req, resp);
		}


}
