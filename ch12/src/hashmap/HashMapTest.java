package hashmap;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Student1> map = new HashMap<String, Student1>();
		map.put("자바왕", new Student1("자바왕", 1, 1));
		
		Student1 s = map.get("자바왕");
		System.out.println(s.ban);
		
		System.out.println(map.get("자바왕").no);
		

	}

}

class Student1{
	String name = "";
	int ban;
	int no;
	
	Student1(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}