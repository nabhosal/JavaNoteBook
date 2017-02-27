package threads;

import java.util.concurrent.TimeUnit;

public class DeadLockExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resource1 = "r1";
		String resource2 = "r2";
		
		Thread t1 = new Thread(() -> {
			
			synchronized (resource1) {
				System.out.println(Thread.currentThread().getName()+" locked "+resource1);
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName()+" locked "+resource2);
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			
			synchronized (resource2) {
				System.out.println(Thread.currentThread().getName()+" locked "+resource2);
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				synchronized (resource1) {
					System.out.println(Thread.currentThread().getName()+" locked "+resource1);
				}
			}	
		});
		
		t1.start();
		t2.start();
		
	}

}
