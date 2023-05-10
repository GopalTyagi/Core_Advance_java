package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebFilter(filterName ="frontctl", urlPatterns = { "*.do" })
public class FrontCtl implements Filter{

	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	
		
	 HttpServletRequest req = (HttpServletRequest) request ;
	 HttpServletResponse resp = (HttpServletResponse) response;
	 HttpSession session = req.getSession();
	 
	 String uri = req.getRequestURI();
	 if(session.getAttribute("name") == null) {
		 
		 RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
		 req.setAttribute("msg", "Session is Expired please re-login Again");	
		 req.setAttribute("uri", uri);
			rd.forward(req, resp);
		 
	 }else {
		 chain.doFilter(request, response);
	 }
		
		
		
	}

	public void destroy() {
		
	}
	
	

}
