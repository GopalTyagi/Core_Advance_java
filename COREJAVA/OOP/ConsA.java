  package in.co.OOP;

 public class ConsA {
	private String fname ;
	private String lname ;
	private String oname ;
    private int id ;
    
    
    public String getFname () {
    	return fname ;
    }
    public String getLname ()  {
    	return lname ; 
    }
    public String getOname () {
    	return oname ;
    }
    public int getId () {
    	return id ;
    }
    
    //parameterized Constructor //
    
    public ConsA(String fname , String lname ,String oname, int id ) {
    
    	this.fname = fname ;
    	this.lname = lname ;
    	this.oname = oname ;
    	this.id = id ;
    }
    public ConsA () {   //Default constructor //
		 super();
		 System.out.println("default");
	 }
	
	 
	 
    
    private String company ;
	private String ceo ;
	private int  networth ;
	private String segment ;
	
	 public String getCompany () {
		 return company ;
	 }
	 public String getCeo () {
		 return ceo ;
	 }
	 public int getNetworth () {
		 return networth ;
	 }
	 public String getSegment () {
		 return segment ;
	 }
	 
	 public ConsA (String company , String ceo , int networth, String segment) {
		 this.company = company ;
		 this.ceo = ceo ;
		 this.networth = networth ;
		 this.segment = segment ;
	 } 
	 
	 
/*	 private String branch;
	 private String owner ;
	 private int collection ;
	 private String hr ;
	 
	 public String getBranch () {
		 return branch = branch ;
	 }
	 public String getOwner () {
		 return owner = owner;
	 }
	 public int getCollection () {
		 return collection = collection;
	 }
	public String getHr () {
		return hr = hr ;
	}
	
	public ConsA (String owner,  String Branch , int collectin , String hr){
	 this.owner = owner;
	 this.branch = branch;
	 this.collection = collection ;
	 this.hr = hr ;
	 
	 }
*/	 
 }
	
 

	 

