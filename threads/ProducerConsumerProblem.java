package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerConsumerProblem {
	
	private class Message{
		String msg;
		boolean isExit;
		public Message(String msg){
			this.msg = msg;
			isExit = false;
		}
		public Message(String msg, boolean isExit){
			this.msg = msg;
			this.isExit = isExit;
			
		}
		public String getMessage(){
			return msg;
		}
		public boolean hasNextMessage(){
			return !isExit;
		}
	}
	
	private class MProducer implements Runnable{
		
		private BlockingQueue<Message> queue;
		
		public MProducer(BlockingQueue<Message> queue){
			this.queue = queue;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0 ; i < 10 ; i++){
				
				queue.add(new Message("Message "+i));
				System.out.println("Sending Message "+i);
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			queue.add(new Message("Exit", true));
		}
	}
	
	private class MConsumer implements Runnable{
		
		private BlockingQueue<Message> queue;
		
		public MConsumer(BlockingQueue<Message> queue){
			this.queue = queue;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			boolean msgAreComing = true;
			while(msgAreComing){
				try {
					Message msg = queue.take();
					System.out.println("Receving "+msg.getMessage());
					TimeUnit.SECONDS.sleep(2);
					if(!msg.hasNextMessage())
						msgAreComing = false;
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}
	
	public void startEngine(){
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		
		Thread consumers = new Thread(new MConsumer(queue));
		Thread producers = new Thread(new MProducer(queue));
		consumers.start();
		producers.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProducerConsumerProblem pcp = new ProducerConsumerProblem();
		pcp.startEngine();
	}

}
