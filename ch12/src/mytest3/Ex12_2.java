package mytest3;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
//			Student s = it.next();  // 형변환 불필요 
//			System.out.println(s.name); 
			System.out.println(it.next().name); // 지네릭스를 사용해서 코드가 간결해졌다.
		}
		
		

	}
}

class Student{
	String name = "";
	int ban;
	int no;
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}
