package oops.interfacetopic.task.task3;

public class Polygon implements Shape {
	
	private double n;
	private double s;
	private double a;
	private double area;
	
	public Polygon(double n, double s, double a) {
		this.n = n;
		this.s = s;
		this.a = a;
	}
	
	@Override
	public void draw() {
		System.out.println("----------Polygon drawn---------");
	}
	
	@Override
	public void resize(double factor) {
		n = n*factor;
		s = s*factor;
		a = a*factor;
		System.out.println("Area after resizing with factor "+factor);
		calculateArea();
	}
	
	@Override
	public void calculateArea() {
		area = 1/2*(n*s*a);
		System.out.println("Area: "+area);
		
	}
	
	

}
