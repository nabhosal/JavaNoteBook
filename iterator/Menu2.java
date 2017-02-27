package iterator;

import java.util.ArrayList;
import java.util.Arrays;

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
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new Menu2IteratorImpl(items);
	}
	
	private class Menu2IteratorImpl implements Iterator{
		
		ArrayList<String> iterItems;
		int position;
		
		Menu2IteratorImpl(String []items){
			position = -1;
			iterItems = new ArrayList<>(Arrays.asList(items));
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(position + 1 <= iterItems.size()){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			position = position + 1;
			return iterItems.get(position);
		}
		
	}

}
