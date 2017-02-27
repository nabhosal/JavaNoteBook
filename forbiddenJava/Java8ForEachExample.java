package forbiddenJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {
	
	class MyConsumer implements Consumer<Integer>{

		public void accept(Integer t) {
			System.out.println("Consumer impl Value::"+t);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) 
			myList.add(i);
		
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {
			
			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}
		});
		
		//traversing with Consumer interface implementation
		Java8ForEachExample.MyConsumer action = (new Java8ForEachExample()).new MyConsumer();
		myList.forEach(action);
	}

}
