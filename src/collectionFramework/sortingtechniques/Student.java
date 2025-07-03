package collectionFramework.sortingtechniques;

public class Student implements Comparable<Student> { /*implements Comparable<Student>*/
	
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	public Student() {
		
	}

	public Student(int rno, String name, int std, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	
	

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	//stdwise sorting
	@Override
	public int compareTo(Student s) {
		if(getStd() > s.getStd()) {
			return 1;
		}else if(getStd() < s.getStd()) {
			return -1;
		}else {
			return 0;
		}
		
	}

	//namewise sorting
//	@Override
//	public int compareTo(Student s) {
//		
//		return getName().compareTo(s.getName());
//	}

	//markwise sorting
//	@Override
//	public int compareTo(Student s) {
//		if(getMarks() > s.getMarks()) {
//			return 1;
//		}else if(getMarks() < s.getMarks()) {
//			return -1;
//		}else {
//			return 0;
//		}
//		
//	}
	
	
	
	
	

}
