package mytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.forEach((i) -> System.out.print(i + " "));
		System.out.println();
		
		list.replaceAll(i -> i * 10);
		System.out.println(list);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"하나");
		map.put(2, "둘");
		map.put(3, "셋");
		
		Set set = map.entrySet();
		System.out.println(set);
		
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		map.forEach((i,s) -> System.out.print(i + "=" + s + " "));
	}
}
