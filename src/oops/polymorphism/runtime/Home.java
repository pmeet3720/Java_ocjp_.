package oops.polymorphism.runtime;

public class Home extends Person {
	
	@Override
	public void getBehave() {
		System.out.println("Home -- getBehave() -- son/daughter");
	}
	
	public void getMovieTime() {
		System.out.println("Home -- getMovieTime() -- movieTime");
	}

}
