package oops.interfacetopic.task.task3;

public class Circle implements Shape {
	
	private double radius;
	private double area;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("----------Circle drawn---------");
	}
	
	@Override
	public void resize(double factor) {
		radius = radius*factor;
		System.out.println("Area after resizing with factor "+factor);
		calculateArea();
	}
	
	@Override
	public void calculateArea() {
		area = 2*3.14*radius;
		System.out.println("Area: "+area);
		
	}

}
