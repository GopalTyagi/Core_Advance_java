package in.co.OOP;

public class TestDepartment {
	
	public static void main(String[] args) {
	
		DepartmentGS d = new DepartmentGS () ;
		
			d.setDepartment("IMC");
			d.setEmployees("employees");
			d.setPermanentaddress("indore");
			d.setLocaladdress("sindhi colony");
			
			System.out.println(d.getDepartment());
			System.out.println(d.getEmployees());
			System.out.println(d.getPermanentaddress());
			System.out.println(d.getLocaladdress());
			
		}
	}

