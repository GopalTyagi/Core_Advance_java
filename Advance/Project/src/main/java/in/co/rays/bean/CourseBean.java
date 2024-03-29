package in.co.rays.bean;

import in.co.rays.bean.BaseBean;

/**
 * Course JavaBean encapsulates Course attributes
 *
 * @author Gopal Tyagi
 *
 */
public class CourseBean extends BaseBean {
	
	private String Course_Name;
	private String Discription;
	private String Duration;
	
	public String getCourse_Name() {
		return Course_Name;
	}
	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setDiscription(String discription) {
		Discription = discription;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public String getKey() {
		return id+"";
	}
	public String getValue() {
		// TODO Auto-generated method stub
		return Course_Name;
	}
	
}