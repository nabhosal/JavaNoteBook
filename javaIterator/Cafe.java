package javaIterator;

import java.util.Iterator;

/*
 * DP 6 : Single Responsibility Design
 * 			
 */

public class Cafe {
	
	public static void print(Iterator iter){
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu m1 = new Menu1();
		Menu m2 = new Menu2();
		
		Iterator iter1 = m1.getIterator();
		Iterator iter2 = m2.getIterator();
		
		/*
		while(iter1.hasNext()){
			System.out.println(iter1.next());
		}
		*/
		while(iter2.hasNext()){
			System.out.println(iter2.next());
		}
		
	}

}
