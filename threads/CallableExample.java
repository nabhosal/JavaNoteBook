package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class CallableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Callable<Integer> task = () -> {
			TimeUnit.SECONDS.sleep(2);
			return 123;
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Integer> res =  executor.submit(task);
		
		System.out.println("future done? " + res.isDone());

		Integer result = null;
		try {
			result = res.get();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("future done? " + res.isDone());
		System.out.print("result: " + result);
		executor.shutdown();
		
		ScheduledExecutorService sexecutor = Executors.newScheduledThreadPool(1);

		Runnable stask = () -> System.out.println("Scheduling: " + System.nanoTime());
		ScheduledFuture<?> future = sexecutor.schedule(stask, 3, TimeUnit.SECONDS);

		try {
			TimeUnit.MILLISECONDS.sleep(1337);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
		System.out.printf("Remaining Delay: %sms", remainingDelay);
		
		sexecutor.shutdown();
		
	}

}
