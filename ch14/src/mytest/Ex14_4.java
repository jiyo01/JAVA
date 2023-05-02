package mytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex14_4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		list.forEach(i -> System.out.print(i + ", "));
		System.out.println();
		
		list.removeIf(i -> i%2==0 || i%3==0);
		System.out.println(list);
		
		list.replaceAll(i -> i * 10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		map.forEach((k,v) -> System.out.print(k + "=" + v + " "));
		
		System.out.println();
		
		/*
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
		
		

	}

}
