package wildCard;

import java.util.ArrayList;

class Fruit{
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{ public String toString() {return "Apple";}}
class Grape extends Fruit{ }

class Juice{
	String name; 
	
	Juice(){}
	
	
	Juice(String name){
		this.name = name + "Juice";
	}
	public String toString() {
		return name;
	}
}

class Juicer{
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		
		for(Fruit f : box.getList()) {
			tmp += f + " " ;
		}
		return new Juice(tmp);  //Juice 인스턴스(객체)를 반환함. = Juice(String name)생성자 호출
	}
}


public class FruitBoxEx3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(fruitBox).toString());
		System.out.println(Juicer.makeJuice(appleBox));
		
	}
}

class FruitBox<T extends Fruit> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T t) {
		list.add(t);
	}
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
	
	ArrayList<T> getList(){
		return list;
	}
}