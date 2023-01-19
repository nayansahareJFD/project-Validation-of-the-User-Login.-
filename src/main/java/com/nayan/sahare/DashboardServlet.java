package com.nayan.sahare;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// to print in web page
		PrintWriter out=resp.getWriter();
		
		
		// to read html code and print it
		resp.setContentType("text/html");
		
		
		
		HttpSession session=req.getSession(false);
		
		String USERNAME= (String) session.getAttribute("keyID");
		String PASSWORD= (String) session.getAttribute("keyPASS");
	        
			/* if (USERNAME == null  ||USERNAME.trim().length() == 0   ||PASSWORD == null||PASSWORD.trim().length() == 0 ) {
	        	
	        	out.print("please enter the user id and password correctly to login");
	        	out.print("<br>");
				out.print("<br>");
				out.print("<br>");
				out.println("<a href='index.html'> go back to  home page</a>" );
	            
	        } else { */
	        	if(session!=null) {
	    				    			
	    			if(USERNAME.equals("nayansahare77085@gmail.com") && PASSWORD.equals("Nayan12345") ) {
	    				out.print("<h1>WELCOME </h1>");
	    				out.print("<br>");
	    				out.print("<br>");
	    				out.print("<br>");
	    				out.println("Your User ID Is : "+"  "+USERNAME);
	    				out.print("<br>");
	    				out.print("<br>");
	    				out.print("<br>");
	    				out.println("<a href='logout'>Logout</a>");
	    				
	    			}else{
	    				out.print("please enter the user id and password correctly to login");
	    	        	out.print("<br>");
	    				out.print("<br>");
	    				out.print("<br>");
	    				out.println("<h3><a href='index.html'> go back to  home page</a></h3>" );
	    				
	    			}
	    			
	    			
	    			
	    			
	    		}
	    		
	        }

	       // }
		
		

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	        doGet(req, resp);
	}
	
	

}
