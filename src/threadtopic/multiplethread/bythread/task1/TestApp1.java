package threadtopic.multiplethread.bythread.task1;

public class TestApp1 {
	
	public static void main(String[] args) {
		Table resource = new Table();
		
		Thread1 t1 = new Thread1(resource);
		Thread2 t2 = new Thread2(resource);
		Thread3 t3 = new Thread3(resource);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
