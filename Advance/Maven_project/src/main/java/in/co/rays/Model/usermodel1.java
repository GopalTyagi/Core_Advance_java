package in.co.rays.Model;

import java.sql.Connection;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import in.co.rays.bean.userbean1;

public class usermodel1 {

	public userbean1 add(userbean1 bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into user1 values(?,?,?)");

		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getName());

		ps.setDate(3, new java.sql.Date(bean.getDob().getTime()));

		ps.executeUpdate();

		return bean;

	}

}
