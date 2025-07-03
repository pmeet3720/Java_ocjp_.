package threadtopic.multiplethread.bythread.task2;

public class MyThread2 extends Thread{
	
	CheckNumber cn = null;
	
	public MyThread2(CheckNumber cn) {
		this.cn = cn;
	}
	
	@Override
	public void run() {
		boolean c = cn.checkArmstrong("153");
		if(c) {
			System.out.println("Is Armstrong");
		}else {
			System.out.println("Not a armstrong");
		}
	}


}
