package oops.inhtopic.hirarchical;

public class ManagementStudent extends Student{
	
	String specialization;
	int caseStudyCount;
	int studentRating;
	String companyName;
	
	public ManagementStudent() {
		
	}
	
	public ManagementStudent(int rno, String name, String specialization, int caseStudyCount, int studentRating, String companyName) {
		super(rno,name);
		this.specialization = specialization;
		this.caseStudyCount = caseStudyCount;
		this.studentRating = studentRating;
		this.companyName = companyName;
	}
	
	public void dispData() {
		System.out.println("Roll No.: "+rno+"\n"+"Name: "+name+"\n"+"Specialization: "+specialization+"\n"+"Case study count: "+caseStudyCount+"\n"+"Student Rating : "+studentRating+"\n"+"Company Name: "+companyName);
	}
	

}
