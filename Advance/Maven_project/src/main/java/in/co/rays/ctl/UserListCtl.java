package in.co.rays.ctl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.Model.UserModel;
import in.co.rays.bean.UserBean;

@WebServlet({ "/Userlist.do" })
public class UserListCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		UserModel m = new UserModel();
		
		ArrayList list = new ArrayList();

		try {
			list = m.search(null);
			RequestDispatcher rd = req.getRequestDispatcher("ListView.jsp");
			req.setAttribute("list", list);
			rd.forward(req, resp);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("fname");
		String op  = req.getParameter("operation");
		
	
		UserModel model = new UserModel();
		List list = new ArrayList();
		
		if(op.equals("search")) {
			try {
				
				list = model.search(name);
				RequestDispatcher rd = req.getRequestDispatcher("ListView.jsp");
				req.setAttribute("list", list);
				rd.forward(req, resp);
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
		}
		

	}

}
