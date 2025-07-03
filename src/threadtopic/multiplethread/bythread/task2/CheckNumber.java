package threadtopic.multiplethread.bythread.task2;

public class CheckNumber {
	
	
	public CheckNumber() {
		
	}
	
	public synchronized boolean checkPrime(int no) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean flag = true;
		int j=0;
		for(j=2;j<=no/2;j++) {
			if(no%j==0) {
				flag = false;
			}
		}
		if(flag && no!=1) {
			return flag;
		}
		return flag;
		
	}
	
	public synchronized boolean checkArmstrong(String no) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		boolean flag = true;
		int length = no.length();
		int orig = Integer.parseInt(no);
		int sum = 0;
		
		while(orig>0) {
			int tmp = orig%10;
			sum += Math.pow(tmp, length);
			orig /= 10;
		}
		if(sum == Integer.parseInt(no)) {
			return true;
		}else {
			return false;
		}
	}
	
	public synchronized boolean checkTwin(int no) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		boolean flag = true;
		int sum=0,mul=1;
		
		while(no>0) {
			int tmp = no % 10;
			sum += tmp;
			mul *= tmp;
			no /= 10;
		}
		
		if(sum == mul) {
			return true;
		}else {
			return false;
		}
	}

}
