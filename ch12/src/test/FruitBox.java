package test;

import java.util.ArrayList;

class Fruit{ public String toString() {
	return "Fruit";
	}
}
class Apple extends Fruit{ public String toString() {return "Apple"; }}
class Grape extends Fruit{ public String toString() {return "Grape"; }}
class Toy{ public String toString() {return "Toy"; }}

public class FruitBox {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Grape> grapeBox = new Box<Grape>();
		Box<Toy> toyBox = new Box<Toy>();
		
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); void add(Apple item)
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple());
		
		System.out.println(fruitBox.toString());
		System.out.println(appleBox);
		System.out.println(toyBox);

	}
}

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
}
