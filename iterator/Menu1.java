package iterator;

import java.util.ArrayList;

public class Menu1 implements Menu{
	
	private ArrayList<String> items;
	
	Menu1(){
		items = new ArrayList<>();
		items.add("M11");
		items.add("M12");
		items.add("M13");
		items.add("M14");
	}
	
	public void addItems(String item){
		items.add(item);
	}
	
	public ArrayList<String> getItems(){
		return items;
	}
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new Menu1IteratorImpl(items);
	}
	
	private class Menu1IteratorImpl implements Iterator{
		
		ArrayList<String> iterItems;
		int position;
		
		@SuppressWarnings("unchecked")
		Menu1IteratorImpl(ArrayList<String> items){
			position = -1;
			iterItems = (ArrayList<String>) items.clone();
			// iterItems = items; // if we don't want mutable iterator 
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(position + 1 < iterItems.size()){
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
