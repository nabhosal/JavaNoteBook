package javaIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Menu2 implements Menu{
	
	private String []items;
	private int capacity = 10;
	
	Menu2(){
		items = new String[capacity];
		items[0] = "item0";
		items[1] = "item1";
		items[2] = "item2";
		items[3] = "item3";
		items[4] = "item4";
	}
	
	@Override
	public Iterator<String> getIterator() {
		// TODO Auto-generated method stub
		return new ArrayList<>(Arrays.asList(items)).iterator();
	}

}
