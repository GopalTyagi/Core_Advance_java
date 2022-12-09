package in.co.OOP;

public class InheritanceShape {   //when one class excess the property of another class is called Inheritance
	
	private String color ;
	private int bw ;
	private int side ;
	
	
	public String getColor () {
		return color ;
	}
	public void setColor (String color) {
		this.color = color;
	}
	public int getBw () {
		return bw ;
	}
	public void setBw (int bw) {
		this.bw = bw;
	}
	public int getSide () {
		return side;
	}
	public void setSide (int side) {
		this.side = side;
	}
	@Override
	public String toString() {
		return color + " " + bw + " " + side ;
	}
	
	
}
