package in.co.rays.bean;


	
	/**
	 * Role JavaBean encapsulates Role attributes
	 *
	 * @author SunilOS
	 * @version 1.0
	 * @Copyright (c) SunilOS
	 *
	 */

	public class RoleBean extends BaseBean {

	    /**
	     * Predefined Role constants
	     */
	    public static final int ADMIN = 1;
	    public static final int STUDENT = 2;
	    public static final int COLLEGE_SCHOOL = 3;
	    public static final int KIOSK = 4;

	    /**
	     * Role Name
	     */

	    private String name;

	    /**
	     * Role Description
	     */
	    private String description;

	    /**
	     * accessor
	     */

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public String getKey() {
	        return id + "";
	    }

	    public String getValue() {
	        return name;
	    }

	}



