package treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet();  //범위 검색, 정렬에 유리. 정렬 필요없음 
//		Set set = new HashSet();  // 정렬 필요함 
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);   // set.add(new Integer(num));
		}					// Integer클래스가 가지고 있는 정렬기준을 이용한다.
		
		System.out.println(set);
	}
}


