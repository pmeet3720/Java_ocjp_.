package threadtopic.multiplethread.bythread;

public class MyThread1 extends Thread {
	
	@Override
	public void run() {
//		System.out.println("Hi I am thread!");
		
		for(int i=0;i<3;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hi I am thread!"+"--"+Thread.currentThread().getId()+"--"+Thread.currentThread().getName());
		}
		super.run();
	}
	
	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		MyThread1 th3 = new MyThread1();
		
		// th1 -- [Thread] -- [callStack] -- [excecutes their tasks with run method()]
		
		th1.start();
		th2.start();
		th3.start();

		
	}
	
}
