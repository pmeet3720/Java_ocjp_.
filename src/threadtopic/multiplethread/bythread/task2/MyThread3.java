package threadtopic.multiplethread.bythread.task2;

public class MyThread3 extends Thread{
	
	CheckNumber cn = null;
	
	public MyThread3(CheckNumber cn) {
		this.cn = cn;
	}
	
	@Override
	public void run() {
		boolean c = cn.checkTwin(123);
		if(c) {
			System.out.println("Is twin number");
		}else {
			System.out.println("Not a twin number");
		}
	}


}
