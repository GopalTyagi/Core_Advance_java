package in.co.rays.bean;

/**
 * DropdownList interface is implemented by Beans those are used to create drop
 * down list on HTML pages
 *
 * @author Gopal Tyagi
 *
 */

public interface DropdownListBean {
	/**
     * Returns key of list element
     *
     * @return key
     */
	public String getKey();
	/**
     * Returns display text of list element
     *
     * @return value
     */
	public String getValue();
}