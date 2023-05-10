package in.co.rays.ctl;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.Model.UserModel;
import in.co.rays.bean.UserBean;

@WebServlet("/User")
public class UserCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		UserModel model = new UserModel();

		UserBean bean = null;

		try {

			bean = model.findByPK(id);
		
			if(bean != null) {
			RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");
			req.setAttribute("bean", bean);
			rd.forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// resp.sendRedirect("Update.jsp");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		String fname = req.getParameter("Name");
		String login = req.getParameter("loginId");
		String pwd = req.getParameter("password");
		String op = req.getParameter("operation");

		if (op.equals("Add")) {

			if (fname.equals("") && login.equals("") && pwd.equals("")) {

				RequestDispatcher rd = req.getRequestDispatcher("UserRegistrationView.jsp");
				req.setAttribute("err", "Fill the Information");
				rd.forward(req, resp);

			} else {
				UserBean bean = new UserBean();
				UserModel model = new UserModel();

				bean.setName(fname);
				bean.setLoginId(login);
				bean.setPassword(pwd);

				try {
					model.add(bean);
					System.out.println("Data Inserted Successfully" );
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
		if(op.equals("Update")) {


			int id = Integer.parseInt(req.getParameter("id"));

			UserModel model = new UserModel();

			UserBean bean = new UserBean();
			
			bean.setName(fname);
			bean.setLoginId(login);
			bean.setPassword(pwd);
			bean.setId(id);
			
			
			try {
				model.update(bean);
				RequestDispatcher rd = req.getRequestDispatcher("ListView.jsp");
				req.setAttribute("msg", "user update Successfully");
				rd.forward(req, resp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
