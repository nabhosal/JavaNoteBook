package javaIterator;

import java.util.ArrayList;
import java.util.Iterator;

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
	public Iterator<String> getIterator() {
		// TODO Auto-generated method stub
		return items.iterator();
	}
	
	
}
