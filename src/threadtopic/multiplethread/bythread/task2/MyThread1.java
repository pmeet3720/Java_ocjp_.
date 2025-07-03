package threadtopic.multiplethread.bythread.task2;

public class MyThread1 extends Thread {
	
	CheckNumber cn = null;
	
	public MyThread1(CheckNumber cn) {
		this.cn = cn;
	}
	
	@Override
	public void run() {
		boolean c = cn.checkPrime(4);
		if(c) {
			System.out.println("Is prime");
		}else {
			System.out.println("Not a prime");
		}
	}

}
