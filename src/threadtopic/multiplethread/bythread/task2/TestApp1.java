package threadtopic.multiplethread.bythread.task2;

public class TestApp1 {
	
	public static void main(String[] args) {
		CheckNumber cn = new CheckNumber();
		
		MyThread1 th1 = new MyThread1(cn);
		MyThread2 th2 = new MyThread2(cn);
		MyThread3 th3 = new MyThread3(cn);
		
		th1.start();
		th2.start();
		th3.start();

	}

}
