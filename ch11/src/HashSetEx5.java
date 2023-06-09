import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx5 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B = " + setB);
		
		Iterator it = setA.iterator();
		while(it.hasNext()) 
			setHab.add(it.next());
		
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setB.contains(tmp))
				setKyo.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
		
		setA.retainAll(setB);  // 교집합. 공통된 요소만 남기고 삭제 
		setA.addAll(setB);     // 합집합. setB의 모든 요소를 추가(중복 제외)
		setA.removeAll(setB);  // 차집합. setB와 공통 요소를 제거 
		
		System.out.println("A와 B의 합집합 : " + setHab);
		System.out.println("A와 B의 교집합 : " + setKyo);
		System.out.println("A 차집합 B : " + setCha);
		
		
		

	}

}
