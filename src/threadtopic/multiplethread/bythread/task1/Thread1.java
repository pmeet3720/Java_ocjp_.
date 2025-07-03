package threadtopic.multiplethread.bythread.task1;

public class Thread1 extends Thread{
	
	Table t = null;
	public Thread1(Table t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printTable(5);
	}

}
