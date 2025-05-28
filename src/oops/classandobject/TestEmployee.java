package oops.classandobject;

public class TestEmployee {
	private int id;
	private int salary;
	private String name;
	private String dsg;
	private String orgname;
	
	//default constructor
	
	public TestEmployee() {
		System.out.println("Employee(Default Constructor)");
	}
	
	//parametrized comnstructors
	
	public TestEmployee(int id, String name) {
		this();
		System.out.println("Employee(id and name) constructor");
		this.id = id;
		this.name = name;
	}
	
	public TestEmployee(int id, String name, int salary) {
		this(id,name);
		System.out.println("Employee(id, name, salary) constructor");
		this.salary = salary;
	}
	
	public TestEmployee(int id, String name, int salary, String dsg) {
		this(id,name,salary);
		System.out.println("Employee(id,name,salary,dsg) constructor");
		this.dsg = dsg;
	}
	
	public TestEmployee(int id, String name, int salary, String dsg, String orgname) {
		this(id,name,salary,dsg);
		System.out.println("EMployee(id, name, salary, dsg, orgname )constructor");
		this.orgname = orgname;
	}
	
	void dispEmpData() {
		System.out.println(id+" "+name+" "+salary+" "+dsg+" "+orgname);
	}

}
