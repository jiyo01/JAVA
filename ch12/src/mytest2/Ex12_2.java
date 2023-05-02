package mytest2;

import java.util.HashMap;

public class Ex12_2 {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("자바왕", new Student("자바왕", 1, 1));
		map.put("지영", new Student("지영", 2, 2));
		
		Student s1 = map.get("자바왕");
		System.out.println(s1.name);
		
		Student s2 = map.get("지영");
		System.out.println(s2.name);
		

	}

}

class Student{
	String name;
	int ban;
	int no;
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}


