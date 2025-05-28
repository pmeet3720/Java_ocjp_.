package oops.inhtopic.hirarchical;

public class TestApp1 {
	
	public static void main(String[] args) {
		//TechStudent obj
		TechStudent techstu = new TechStudent(1,"Meet",10,"Java","student management","Oracle");
		techstu.dispData();
		
		//ManagementStudent obj
		ManagementStudent mangstu = new ManagementStudent(2,"Sagar","hr",12,7,"Microsoft");
		mangstu.dispData();
	}
	
	// In java we don't have multiple Inheritence concept since it is complex and is removed from java.
	// B             c
	// ---------------
	// |             |
	// |             |
	// ---------------
	//        |
	//        |
	//        A
	

}
