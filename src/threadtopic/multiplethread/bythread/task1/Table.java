package threadtopic.multiplethread.bythread.task1;

public class Table {
	
	public synchronized void printTable(int no) {
		for (int i = 1; i <= 10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+"---"+no+" * "+i+" = "+no*i);
			
		}
	}

}
