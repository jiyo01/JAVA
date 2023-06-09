import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		// set의 크기가 6보다 작은 동안 1~45사이의 랜덤값 저장 
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
//			set.add(num);    //이렇게 쓰면 컴파일러가 위에처럼 바꿔준다 
			
		}
		
		List list = new LinkedList(set); // LinkedList(Collection c) 생성자 이용
		Collections.sort(list);
		System.out.println(list);

	}

}
