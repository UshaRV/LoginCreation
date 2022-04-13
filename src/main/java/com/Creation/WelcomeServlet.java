package com.Creation;
import java.io.*;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.*;  
import javax.servlet.http.*;  

public class WelcomeServlet extends HttpServlet {
	  public void doPost(HttpServletRequest request, HttpServletResponse response)  
		        throws ServletException, IOException {  
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("userName");  
		    out.print("Welcome "+n);  
		    }  
		  
		}  
	


