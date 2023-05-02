

class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj; //obj를 Person타입으로 형변환
		return this.id == p.id; 
	}
	
	Person(long id){
		this.id = id;
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person(1234);
		Person p2 = new Person(1234);
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}
}
