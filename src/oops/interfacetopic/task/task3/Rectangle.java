package oops.interfacetopic.task.task3;

public class Rectangle implements Shape {
	
	private double length;
	private double width;
	private double area;
	
	
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("----------Rectangle drawn---------");
	}
	
	@Override
	public void resize(double factor) {
		length = length*factor;
		width = width*factor;
		System.out.println("Area after resizing with factor "+factor);
		calculateArea();
	}
	
	@Override
	public void calculateArea() {
		area = length*width;
		System.out.println("Area: "+area);
		
	}

}
