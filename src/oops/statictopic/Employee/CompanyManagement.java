package oops.statictopic.Employee;

public class CompanyManagement {
	
	public static void main(String[] args) {
		// for each employee
		Project project1[] = {
				new Project(101,"AI development"),
				new Project(102,"Web development"),
		};
		
		Employee.companyName = "Google";
		
		Employee e = new Employee(1,"Meet",project1);
		e.displayEmployeeDetails();
		
		
	}

}
