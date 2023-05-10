package in.co.rays.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import in.co.rays.bean.UserBean;

public class UserModel {

	public Integer nextPk() throws Exception {
		int pk = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		PreparedStatement ps = c.prepareStatement("select max(id) from user");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			rs.getInt(1);
		}

		return pk + 1;
	}

	public void add(UserBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into user values(?,?,?,?)");

		ps.setInt(1, nextPk());
		ps.setString(2, bean.getName());
		ps.setString(3, bean.getLoginId());
		ps.setString(4, bean.getPassword());

		ps.executeUpdate();

	}

	public UserBean authenticate(String loginId, String password) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

		UserBean bean = null;

		try {

			PreparedStatement ps = c.prepareStatement("select * from user where loginid=? and password=?");
			ps.setString(1, loginId);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				bean = new UserBean();

				bean.setId(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setLoginId(rs.getString(3));
				bean.setPassword(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;

	}

	public ArrayList search(String fname) throws ClassNotFoundException, SQLException {

		StringBuffer sql = new StringBuffer("select * from user where 1=1");

		ArrayList list = new ArrayList();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

		if (fname != null) {

			sql.append(" and Name like '" + fname + "%'");

		}

		PreparedStatement ps = c.prepareStatement(sql.toString());

		ResultSet rs = ps.executeQuery();

		UserBean bean = null;
		while (rs.next()) {
			bean = new UserBean();

			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setLoginId(rs.getString(3));
			bean.setPassword(rs.getString(4));

			list.add(bean);
		}
		return list;
	}

	/*
	 * public void delete(UserBean bean) throws ClassNotFoundException, SQLException
	 * {
	 * 
	 * 
	 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection c =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root",
	 * "root"); PreparedStatement ps =
	 * c.prepareStatement("insert into user values(?,?,?,?)");
	 * 
	 * ps.setString(1, bean.getName()); int i = ps.executeUpdate(); }
	 * 
	 * public void update(UserBean bean) throws ClassNotFoundException, SQLException
	 * {
	 * 
	 * 
	 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection c =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root",
	 * "root"); PreparedStatement ps =
	 * c.prepareStatement("update user set name=? , loginid=? , password=?");
	 * 
	 * 
	 * 
	 * ps.setString(1, bean.getName());
	 * 
	 * int i = ps.executeUpdate(); }
	 */
	public UserBean findByLogin(String login) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from user where loginid=?");

		UserBean bean = null;
		ps.setString(1, login);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setLoginId(rs.getString(3));
			bean.setPassword(rs.getString(4));

		}
		rs.close();
		System.out.println("findby login = success");
		return bean;
	}

	public UserBean findByPK(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from user where id=?");
		UserBean bean = null;

		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {

			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setLoginId(rs.getString(3));
			bean.setPassword(rs.getString(4));

		}
		rs.close();
		return bean;
	}

	public void update(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		PreparedStatement ps = c.prepareStatement("update user set name=? ,loginid=? , password=? where id=?");

		ps.setString(1, bean.getName());
		ps.setString(2, bean.getLoginId());
		ps.setString(3, bean.getPassword());
		ps.setInt(4, bean.getId());

		ps.executeUpdate();

		ps.close();

	}

}
