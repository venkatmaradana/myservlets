package com.amar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet { //implements Servlet {

    /*public HelloServlet() {
		   System.out.println("I am HelloServlet No arg constructor");
	   }
    public void init(ServletConfig sc) throws ServletException{
		   System.out.println("I am HelloServlet init() method");
	   }*/
	
	public void init() {
		 System.out.println("I am HelloServlet init() method");
	}

	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws  IOException, ServletException {
	       res.setContentType("text/html");
		   PrintWriter pw= res.getWriter();
		   
		   
		   System.out.println("@@@@@@@@@@:   "+req.getQueryString());
		   
		   String cName = req.getParameter("name");	
	       String sal = req.getParameter("sal");	
		   
		   pw.println("<html>");
		   pw.println("<body>");
		   pw.println("Hello... Welcome to servlet sessions MR. "+cName+" and your salary: "+sal);
		   pw.println("<br/>");
		   pw.println("<a href='myhtml.html'>Back</a>");
		   pw.println("</body>");
		   pw.println("</html>");
		   
	   }

    /*public void destroy() {}
	   
	   public String getServletInfo() {
	      return "MyServlet";
	   }
	   
	   public ServletConfig getServletConfig() {
	      return null;
	   }*/
	
	public static void main(String[] s) {
		
		String s1 = "%24filter=accessId%20eq%20%27122%27%20and%20clientId%20eq%20133";
		s1 = s1.replaceAll("%24", "");
		s1 = s1.replaceAll("%20", "");
		s1 = s1.replaceAll("%27", "");
		
		System.out.println(s1);
	}
}