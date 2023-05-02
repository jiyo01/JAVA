import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex14_4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++)
			list.add(i);
		
		//list의 모든 요소를 출력
		list.forEach(x -> System.out.print(x + ", "));
		System.out.println(); //개행
		System.out.println(list);
		
		//list에서 2의 배수 또는 3의 배수를 제거한다.
		list.removeIf(i -> i%2==0 || i%3==0);
		System.out.println(list);
		
		list.replaceAll(i -> i * 10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		// map의 모든 요소를 출력
		map.forEach((a,b) -> System.out.print(a + "=" + b + " "));
		
		System.out.println();
		
		//아래는 iterator()로 map의 있는 요소를 출력하기. 
//		Set set = map.entrySet();
//		Iterator it = set.iterator();
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
