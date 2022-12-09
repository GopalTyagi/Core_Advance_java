package in.co.OOP;

public class TestShapeInheri {
	public static void main(String[] args) {
		
    	CircleEx c = new CircleEx () ;
		TriangleEx t = new TriangleEx ();
		RectangleEx r = new RectangleEx();
		
		//Parent class can  keep reference of child class //
		
		// InheritanceShape s = new CircleEx();
		
		//CircleEx c1 = (circleEx) new ShapeInheri();
		//System.out.println(s.getcolor());
		c.setColor("red");
		String color = c.getColor();
		System.out.println(color);
		
		c.setRadius(2);
		double d =c.area();
		
		System.out.println(c.getRadius());
		System.out.println(d);
		
		r.setLength(12);
		r.setWidth(10);
		double d1 = r.area();
		
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(d1);
		
		t.setBase(6);
		t.setHeigth(2);
		double d2 = t.area();
		
		System.out.println(t.getBase());
		System.out.println(t.getHeigth());
		System.out.println(d2);
		
	}

}       
