package threadtopic.multiplethread.bythread.task1;

public class Thread3 extends Thread{
	
	Table t = null;
	
	public Thread3(Table t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printTable(15);
	}

}
