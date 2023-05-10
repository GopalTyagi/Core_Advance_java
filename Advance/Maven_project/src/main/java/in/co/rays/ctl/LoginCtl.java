  package in.co.rays.ctl;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.Model.UserModel;
import in.co.rays.bean.UserBean;

@WebServlet("/Login")
public class LoginCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String op = req.getParameter("operation");

		if (!"null".equalsIgnoreCase(op) && "logout".equals(op)) {
			

			  HttpSession session = req.getSession();
			  session.invalidate();
			
		resp.sendRedirect("LoginView.jsp");
			
			/*
			 * RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
			 * rd.forward(req, resp);
			 */

		 }

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String login = req.getParameter("loginId");
		String pwd = req.getParameter("password");
		String op = req.getParameter("operation");

		HttpSession session = req.getSession();

		if (op.equals("SignUp")) {

			resp.sendRedirect("UserRegistration");

		}
		if (op.equals("SignIn")) {
			UserBean bean = new UserBean();
			UserModel model = new UserModel();

			try {
				UserBean b = model.authenticate(login, pwd);
				if (b != null) {

					session.setAttribute("name", b.getName());

					String uri = (String) req.getParameter("uri");

					if (uri.equalsIgnoreCase("null")) {

						RequestDispatcher rd = req.getRequestDispatcher("WelcomeView.jsp");
						rd.forward(req, resp);

					}
						else {
						resp.sendRedirect(uri);
					}

				} else {

					RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
					req.setAttribute("msg", "Invalid loginid and password !!!  ");
					rd.forward(req, resp);

				}

			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		}
	}
}