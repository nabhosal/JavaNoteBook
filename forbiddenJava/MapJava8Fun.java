package forbiddenJava;

import java.util.ArrayList;
import java.util.HashMap;

public class MapJava8Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("abc", 10);
		map.forEach((id,val) -> System.out.println(val));
		map.putIfAbsent("abc", 1);
		map.forEach((id,val) -> System.out.println(val));
		System.out.println(map.getOrDefault("abcd", 0));
		System.out.println(map.containsValue(1));
		
		map.remove("abc", 1);
		map.forEach((key,value) -> {
			if(key.equals("abc")){
				System.out.println(value *3);
			}
		});
		
		ArrayList<String> aslist = new ArrayList<>();
		aslist.add("a");
		aslist.add("b");
		aslist.add(null);
		aslist.add("c");
		System.out.println(aslist);
		for(String s : aslist){
			if("a".equals(s))
				System.out.println(s);
		}
	}

}
