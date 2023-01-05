 package in.co.OOP;

public class TestConsA {
	public static void main(String[] args) {
		
		ConsA c1 = new ConsA("gopal","sharma","tyagi",19);
		String fn = c1.getFname();
		System.out.println(fn);
		
		String ln = c1.getLname();
	    System.out.println(ln);
 	    
	    String on = c1.getOname();
	    System.out.println(on);
	    
	    int  id = c1.getId();
	    System.out.println(id);
	    
	    
	    
		ConsA qw = new ConsA("tata","josef",2000, "automobile");
		
		String f = qw.getCompany();
		System.out.println(f);
		
		String e = qw.getCeo();
		System.out.println(e);
		
		String s= qw.getSegment();
		System.out.println(s);
		
		int d = qw.getNetworth();
		System.out.println(d);
		
		
		
		
		ConsA ab = new ConsA("gopal","rohit","mangal",132) ;
		
		String g = ab.getFname();
		System.out.println(g);	
		
		String r = ab.getLname();
		System.out.println(r);
		
		String m = ab.getOname();
		System.out.println(m);
		
		int q = ab.getId();
		System.out.println(q);
		
		
		ConsA zx = new ConsA("gopal","singh","tyagi",124);
		
		String a = zx.getFname();
		System.out.println(a);
		String h = zx.getLname();
		System.out.println(h);
		String l = zx.getOname();
		System.out.println(l);
		int k = zx.getId();
		System.out.println(k);
		
	
	}

	}

