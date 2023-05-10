package in.co.rays.practise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/set")
public class SetCookies extends HttpServlet {
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		
		String name = req.getParameter("name");
		String psw = req.getParameter("password");
		
		Cookie c = new Cookie(name, psw);
		c.setMaxAge(60);
		resp.addCookie(c);
		
		
	}
	
	

}
