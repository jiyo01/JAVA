package mytest;

import java.util.ArrayList;

class Fruit{
	public String toString() {
		return "과일";
	}
}

class Apple extends Fruit{
	public String toString() {
		return "사과";
	}
}

class Grape extends Fruit{ public String toString() { return "포도"; } }

class Toy{ public String toString() { return "Toy"; }}


public class FruitBoxTest {

	public static void main(String[] args) {
		Box1<Fruit> fruitBox = new Box1<Fruit>();
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
//		fruitBox.add(new Toy());   // void add(Fruit item) Toy는 Fruit의 자손이 아님
		
		Box1<Apple> appleBox = new Box1<Apple>();
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		Box1<Toy> toyBox = new Box1<Toy>();
		toyBox.add(new Toy());   // void add(Toy item)
//		toyBox.add(new Grape());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox.toString());

	
	}
}

class Box1<T>{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
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
}
