package threads;

import java.util.concurrent.TimeUnit;

/*
 * Runnable r = new Runnable(){}
 * r.run() // run
 * Thread t = new Thread(new Runnable(){})
 * t.start(); // works
 * t.start(); // illgal State Exception
 * r.run()    // Multiple call to run will work smooth ... but same is not true for thread
 */
public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable task = () -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		};

		task.run();

		Thread thread = new Thread(task);
		thread.start();

		System.out.println("Done!");
		Thread thread1 = new Thread(task);
		thread1.start();
		
		//task.run();
		//task.run();
		
		Runnable runnable = () -> {
		    try {
		        String name = Thread.currentThread().getName();
		        System.out.println("Foo " + name);
		        TimeUnit.SECONDS.sleep(1);
		        System.out.println("Bar " + name);
		    }
		    catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		};

		Thread thread3 = new Thread(runnable);
		thread3.start();
		
	}

}
