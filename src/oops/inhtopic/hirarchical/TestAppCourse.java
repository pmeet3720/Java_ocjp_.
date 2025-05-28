package oops.inhtopic.hirarchical;

public class TestAppCourse {
	
	public static void main(String[] args) {
		OnlineCourse onc = new OnlineCourse(101,"Java","2hr","Zoom");
		OfflineCourse ofc = new OfflineCourse(102,"DSA","3hr",201,"Ahmedabad");
		HybridCourse hc = new HybridCourse(103,"Python","2hr","Zoom",305);
		
		System.out.println("------Online Course-------");
		onc.dispData();
		
		System.out.println("\n");

		System.out.println("------Offline Course------");
//		System.out.println("\n");
		ofc.dispData();
		
		System.out.println("\n");

		System.out.println("------Hybrid Course-------");
//		System.out.println("\n");
		hc.dispData();
	}

}
