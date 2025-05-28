package oops.inhtopic.hirarchical;

public class TechStudent extends Student {
	
	int labScores;
	String programmingLanguages;
	String projectTitle;
	String intershipCompany;
	
	public TechStudent() {
		
	}
	
	public TechStudent(int rno, String name, int labScores, String programmingLanguages, String projectTitle, String internshipCompany) {
		super(rno,name);
		this.labScores = labScores;
		this.programmingLanguages = programmingLanguages;
		this.projectTitle = projectTitle;
		this.intershipCompany = internshipCompany;
	}
	
	public void dispData() {
		System.out.println("Roll No.: "+rno+"\n"+"Name: "+name+"\n"+"Lab Score: "+labScores+"\n"+"Programming Languages: "+programmingLanguages+"\n"+"ProjectTitle: "+projectTitle+"\n"+"Internship Company: "+intershipCompany);
	}
	

}
