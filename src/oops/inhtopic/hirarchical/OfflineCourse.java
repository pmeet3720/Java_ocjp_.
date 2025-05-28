package oops.inhtopic.hirarchical;

public class OfflineCourse extends Course {

	int roomNumber;
	String campusLocation;
	
	public OfflineCourse() {
		
	}
	
	public OfflineCourse(int courseId, String courseName, String duration, int roomNumber, String campusLocation) {
		super(courseId,courseName,duration);
		this.roomNumber = roomNumber;
		this.campusLocation = campusLocation;
	}

	public void dispData() {
		// TODO Auto-generated method stub
		
		System.out.println("CourseId: "+courseId+"\n"+"CourseName: "+courseName+"\n"+"Duration: "+duration+"\n"+"Room Number: "+roomNumber+"\n"+"Campus Location: "+campusLocation);

	}
}
