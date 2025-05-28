package oops.inhtopic.hirarchical;

public class HybridCourse extends Course {
	
	String platform;
	int roomNumber;
	
	public HybridCourse() {
		
	}
	
	public HybridCourse(int courseId, String courseName, String duration, String platform, int roomNumber)
	{
		super(courseId, courseName, duration);
		this.platform = platform;
		this.roomNumber = roomNumber;
	}

	public void dispData() {
		// TODO Auto-generated method stub
		
		System.out.println("CourseId: "+courseId+"\n"+"CourseName: "+courseName+"\n"+"Duration: "+duration+"\n"+"Platform: "+platform+"\n"+"Room Number: "+roomNumber);
		
	}
}
