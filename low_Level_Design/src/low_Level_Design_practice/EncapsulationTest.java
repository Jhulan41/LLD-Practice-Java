package low_Level_Design_practice;

public class EncapsulationTest {
	
	public static void main(String[] args) {
		EncapsulationExample employee = new EncapsulationExample();
		employee.setName("Jhulan");
		employee.setcompanyName("Boeing");
		employee.setDesignation("SDE-1");
		
		System.out.println("Name: " + employee.getName() +"\n"+"Designation: "+ employee.getDesignation()
						   +"\n"+"CompanyName: "+employee.getCompanyName());
		
	}
		
}

 
