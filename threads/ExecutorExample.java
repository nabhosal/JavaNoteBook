package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		});
		executor.submit(() -> {
			String name = String.valueOf(Thread.currentThread().getId());
			System.out.println("I'm thread "+name);
		});
		System.out.println("executor.isTerminated() "+executor.isTerminated());
		executor.shutdown();
		System.out.println("After executor Terminated() "+executor.isTerminated()+" is shutdown "+executor.isShutdown());
		
		ExecutorService executor1 = Executors.newFixedThreadPool(10);
		
		executor1.submit(() -> {
			System.out.println(Thread.currentThread().getName());
		});
		
		executor1.shutdown();
	}

}
