import java.util.HashSet;
import java.util.Set;

public class HashSetEx3 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);

	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {  //toString() 오버라이딩 
		return name + ":" + age;
	}
}

