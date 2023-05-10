package in.co.rays.test;

import in.co.rays.bean.UserBean;
import in.co.rays.exception.ApplicationException;
import in.co.rays.exception.DuplicateRecordException;
import in.co.rays.exception.RecordNotFoundException;
import in.co.rays.model.UserModel;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * User Model Test classes
 *
 * @author Gopal Tyagi
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */
public class UserModelTest {

	/**
	 * Model object to test
	 */

	public static UserModel model = new UserModel();

	/**
	 * Main method to call test methods.
	 *
	 * @param args
	 * @throws ParseException
	 * @throws DuplicateRecordException
	 */
	public static void main(String[] args) throws ParseException, DuplicateRecordException {
		// testAdd();
		// testDelete();
		// testUpdate();
		// testFindByPK();
		// testFindByLogin();
		// testSearch();
		// testList();
		// testAuthenticate();
		
		
		//testRegisterUser();
		// testchangePassword();
		// testforgetPassword();
		// testresetPassword();
		// testGetRoles();
	}

	/**
	 * Tests add a User
	 *
	 * @throws ParseException
	 * @throws DuplicateRecordException
	 */
	public static void testAdd() throws ParseException, DuplicateRecordException {

		try {
			UserBean bean = new UserBean();
			SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyy");

			bean.setId(0);
			bean.setFirstName("guru");
			bean.setLastName("sharma");
			bean.setLogin("guru12@g.com");
			bean.setPassword("pass1234");
			bean.setConfirmPassword("pass1234");
			bean.setDob(sdf.parse("31-12-1990"));
			bean.setMobileNo("9898786756");
			bean.setRoleId(1L);
			bean.setGender("Male");
			bean.setCreatedBy("gopal");
			bean.setModifiedBy("haren");
			bean.setCreatedDatetime(null);
			bean.setModifiedDatetime(null);

			long pk = model.add(bean);
			UserBean addedbean = model.findByPK(pk);
			// System.out.println("Test add succ");
			if (addedbean != null) {
				System.out.println("Test add pass");
			} else {
				System.out.println("fail");
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Tests delete a User
	 */
	public static void testDelete() {

		try {
			UserBean bean = new UserBean();
			long pk = 0L;
			bean.setId(2);
			model.delete(bean);
			System.out.println("Test Delete succ" + bean.getId());
			UserBean deletedbean = model.findByPK(pk);
			if (deletedbean == null) {
				System.out.println("Test Delete fail");
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests update a User
	 */
	public static void testUpdate() {

		try {
			UserBean bean = model.findByPK(5);
			bean.setFirstName("rajat");
			bean.setLastName("sharma");
			bean.setLogin("rajat12@gmail.com");
			bean.setPassword("pass1234");

			model.update(bean);

			/*
			 * UserBean updatedbean = model.findByPK(1L\); if
			 * (!"ranjit".equals(updatedbean.getLogin())) {
			 * System.out.println("Test Update fail"); }
			 */
		} catch (ApplicationException e) {
			e.printStackTrace();
		} catch (DuplicateRecordException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests find a User by PK.
	 */
	public static void testFindByPK() {
		try {
			UserBean bean = new UserBean();
			long pk = 3L;
			bean = model.findByPK(pk);
			if (bean == null) {
				System.out.println("Test Find By PK fail");
			}
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLogin());
			System.out.println(bean.getPassword());
			System.out.println(bean.getConfirmPassword());
			System.out.println(bean.getDob());
			System.out.println(bean.getRoleId());

			System.out.println(bean.getGender());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Tests find a User by Login.
	 */
	public static void testFindByLogin() {
		try {
			UserBean bean = new UserBean();
			bean = model.findByLogin("guru12@g.com");
			if (bean == null) {
				System.out.println("Test Find By PK fail");
			}
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLogin());
			System.out.println(bean.getPassword());
			System.out.println(bean.getConfirmPassword());
			System.out.println(bean.getDob());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getRoleId());
			System.out.println(bean.getGender());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests get Roles.
	 */
	public static void testGetRoles() {

		try {
			UserBean bean = new UserBean();
			List list = new ArrayList();
			bean.setRoleId(2L);
			list = model.getRoles(bean);
			if (list.size() < 0) {
				System.out.println("Test Get Roles fail");
			}
			Iterator it = list.iterator();
			while (it.hasNext()) {
				bean = (UserBean) it.next();
				System.out.println(bean.getId());
				System.out.println(bean.getFirstName());
				System.out.println(bean.getLastName());
				System.out.println(bean.getLogin());
				System.out.println(bean.getPassword());
				System.out.println(bean.getDob());
				System.out.println(bean.getRoleId());
				System.out.println(bean.getUnSuccessfulLogin());
				System.out.println(bean.getGender());
				System.out.println(bean.getLastLogin());
				System.out.println(bean.getLock());
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests get Search
	 */
	public static void testSearch() {

		try {
			UserBean bean = new UserBean();
			List list = new ArrayList();
			bean.setFirstName("guru");
			list = model.search(bean, 0, 0);
			if (list.size() < 0) {
				System.out.println("Test Serach fail");
			}
			Iterator it = list.iterator();
			while (it.hasNext()) {
				bean = (UserBean) it.next();
				System.out.println(bean.getId());
				System.out.println(bean.getFirstName());
				System.out.println(bean.getLastName());
				System.out.println(bean.getLogin());
				System.out.println(bean.getPassword());
				System.out.println(bean.getConfirmPassword());
				System.out.println(bean.getDob());
				System.out.println(bean.getMobileNo());
				System.out.println(bean.getRoleId());
				System.out.println(bean.getGender());
				System.out.println(bean.getCreatedBy());
				System.out.println(bean.getModifiedBy());
				System.out.println(bean.getCreatedDatetime());
				System.out.println(bean.getModifiedDatetime());

			}

		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Tests get List.
	 */
	public static void testList() {

		try {
			UserBean bean = new UserBean();
			List list = new ArrayList();
			list = model.list(1, 10);
			if (list.size() < 0) {
				System.out.println("Test list fail");
			}
			Iterator it = list.iterator();
			while (it.hasNext()) {
				bean = (UserBean) it.next();
				System.out.println(bean.getId());
				System.out.println(bean.getFirstName());
				System.out.println(bean.getLastName());
				System.out.println(bean.getLogin());
				System.out.println(bean.getPassword());
				System.out.println(bean.getConfirmPassword());
				System.out.println(bean.getDob());
				System.out.println(bean.getRoleId());

				System.out.println(bean.getGender());

				System.out.println(bean.getMobileNo());
				System.out.println(bean.getCreatedBy());
				System.out.println(bean.getModifiedBy());
				System.out.println(bean.getCreatedDatetime());
				System.out.println(bean.getModifiedDatetime());
			}

		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests authenticate User.
	 */
	public static void testAuthenticate() {

		try {
			UserBean bean = new UserBean();
			bean.setLogin("mangal12@g.com");
			bean.setPassword("pass1234");
			bean = model.authenticate(bean.getLogin(), bean.getPassword());
			if (bean != null) {
				System.out.println("Successfully login");

			} else {
				System.out.println("Invalied login Id & password");
			}

		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tests add a User register
	 *
	 * @throws ParseException
	 */

	/*
	 * public static void testRegisterUser() throws ParseException { try { UserBean
	 * bean = new UserBean(); SimpleDateFormat sdf = new
	 * SimpleDateFormat("MM/dd/yyyy");
	 * 
	 * bean.setId(1); bean.setFirstName("gopal"); bean.setLastName("tyagi");
	 * 
	 * bean.setLogin("rranjitch11ou1dhay@gmail.com"); bean.setPassword("rr");
	 * bean.setConfirmPassword("4444"); bean.setDob(sdf.parse("11/20/2015"));
	 * bean.setGender("Male"); bean.setRoleId(2);
	 * 
	 * 
	 * long pk = model.registerUser(bean);
	 * 
	 * System.out.println("Successfully register");
	 * System.out.println(bean.getFirstName()); System.out.println(bean.getLogin());
	 * System.out.println(bean.getLastName()); System.out.println(bean.getDob());
	 * UserBean registerbean = model.findByPK(pk); if (registerbean != null) {
	 * System.out.println("Test registation fail"); } } catch (ApplicationException
	 * e) { e.printStackTrace(); } catch (DuplicateRecordException e) {
	 * e.printStackTrace(); } }
	 */

	/**
	 * Tests changepassword
	 *
	 * @throws ParseException
	 */
	/*
	 * public static void testchangePassword() {
	 * 
	 * try { UserBean bean = model.findByLogin("ranjitchoudhary20@gmail.com");
	 * String oldPassword = bean.getPassword(); bean.setId(15l);
	 * bean.setPassword("88"); bean.setConfirmPassword("kk"); String newPassword =
	 * bean.getPassword(); try { model.changePassword(15L, oldPassword,
	 * newPassword); System.out.println("password has been change successfully"); }
	 * catch (RecordNotFoundException e) { e.printStackTrace(); }
	 * 
	 * } catch (ApplicationException e) { e.printStackTrace(); }
	 * 
	 * }
	 * 
	 *//**
		 * Tests fogetPassword
		 *
		 * @throws ParseException
		 */
	/*
	 * public static void testforgetPassword() { try { boolean b =
	 * model.forgetPassword("ranjitchoudhary20@gmail.com");
	 * 
	 * System.out.println("Suucess : Test Forget Password Success");
	 * 
	 * } catch (RecordNotFoundException e) { e.printStackTrace(); } catch
	 * (ApplicationException e) { e.printStackTrace(); } }
	 * 
	 *//**
		 * Tests resetPassword
		 *
		 * @throws ParseException
		 *//*
			 * public static void testresetPassword() { UserBean bean = new UserBean(); try
			 * { bean = model.findByLogin("ranjitchoudhary20@gmail.com"); if (bean != null)
			 * { boolean pass = model.resetPassword(bean); if (pass = false) {
			 * System.out.println("Test Update fail"); } }
			 * 
			 * } catch (ApplicationException e) { e.printStackTrace(); }
			 * 
			 * } }
			 * 
			 * 
			 * 
			 */

}
