package threadtopic.multiplethread.bythread;

public class DaemonThread1 extends Thread{
	
	@Override
	public void run() {
		
		if(isDaemon()) {
			System.out.println("Hi I'm daemon thread( service provider thread )");
		}else {
			System.out.println("Hi I'm Thread");
		}
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		
		DaemonThread1 dt1 = new DaemonThread1();
		dt1.setDaemon(true);
		dt1.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
