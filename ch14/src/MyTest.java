import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "하나" );
		map.put(2, "둘");
		map.put(3,  "셋");
		System.out.println(map);
		System.out.println(map.toString());
		
		System.out.println();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set set = map.entrySet();
		Iterator it2 = set.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());

	}

}
