package threadtopic.multiplethread.bythread.task1;

public class Thread2 extends Thread{
	
	Table t = null;
	
	public Thread2(Table t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printTable(10);
	}

}
