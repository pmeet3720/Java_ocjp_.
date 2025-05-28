package oops.inhtopic.hirarchical;

public class OnlineCourse extends Course {
	
	String platform;
	
	public OnlineCourse() {
		
	}
	
	public OnlineCourse(int courseId, String courseName, String duration, String platform) {
		super(courseId,courseName,duration);
		this.platform = platform;
	}

	public void dispData() {
		// TODO Auto-generated method stub
	
		System.out.println("CourseId: "+courseId+"\n"+"CourseName: "+courseName+"\n"+"Duration: "+duration+"\n"+"Platform: "+platform);
	}

}
