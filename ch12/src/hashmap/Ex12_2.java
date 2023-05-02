package hashmap;

import java.util.HashMap;

public class Ex12_2 {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));
		
//		Student s = (Student)map.get("자바왕"); //옛날에는 형변환이 필요했다.
		
		// public V get(Object key) -> public Student get(Object key) 메서드를 이용 
		Student s = map.get("자바왕");  //get()메서드의 반환타입이 Student이므로 형변환 불필요 
		System.out.println(s.name);
		
		System.out.println(map.get("자바왕").eng);
	}
}

class Student{
	String name = "";
	int ban;   // 반 
	int no;    // 번호
	int kor;   // 국어 성적
	int eng;   // 영어 성적
	int math;  // 수학 성적 
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}
