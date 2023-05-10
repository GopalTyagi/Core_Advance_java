package in.co.rays.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.Model.usermodel1;
import in.co.rays.bean.userbean1;

@WebServlet("/user")
public class userctl1 extends HttpServlet {


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM");

		int i = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");

		usermodel1 model = new usermodel1();
		userbean1 bean = new userbean1();

		
			bean.setId(i);
			bean.setName(name);
			try {
				bean.setDob(sdf.parse(dob));
					model.add(bean);
			} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
			}
			
	}
