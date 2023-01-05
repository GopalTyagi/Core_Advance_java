package in.co.OOP;

public class TriangleEx extends InheritanceShape  {
	
	private int base ;
	private int heigth ;
	private  String color ;
	private int bw ;
	
	
	public int getBw () {
		return bw ;
	}
	public void setBw (int bw) {
		this.bw = bw;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBase () {
		return base;
	}
	public void setBase (int base) {
		this.base = base;
	}
	public int getHeigth () {
		return heigth;
	}
	public void setHeigth (int heigth) {
		this.heigth = heigth;
	}
	public double area () {
		return 0.5 * base * heigth;
	} 

}
