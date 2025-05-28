package oops.statictopic.Employee;

public class Employee {
	
	int empId;
	String empName;
	Project[] projects;
	static String companyName;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, Project[] projects) {
		
		this.empId = empId;
		this.empName = empName;
		this.projects = projects;
		
	}
	
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	public void displayEmployeeDetails() {
		System.out.print(empId+" "+empName+" "+companyName+"\n\t");
		for (Project project : projects) {
			System.out.print(" "+project.getProjectId()+" "+project.getProjectName());
		}
	}

}
