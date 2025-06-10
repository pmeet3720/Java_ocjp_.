package oops.interfacetopic.task.task3;

public class Triangle implements Shape {
	
	private double b;
	private double h;
	private double area;
	
	public Triangle(double b, double h) {
		this.b = b;
		this.h = h;
	}

	@Override
	public void draw() {
		System.out.println("----------Triangle drawn---------");
	}
	
	@Override
	public void resize(double factor) {
		b = b*factor;
		h = h*factor;
		System.out.println("Area after resizing with factor "+factor);
		calculateArea();
	}
	
	@Override
	public void calculateArea() {
		area = 1/2*b*h;
		System.out.println("Area: "+area);
		
	}

}
