package mytest2;

import java.util.ArrayList;

class Fruit implements Eatable{
	public String toString() {return "Fruit";}
}
class Apple extends Fruit{ public String toString() {return "Apple";}}
class Grape extends Fruit{ public String toString() {return "Grape";}}
class Toy{ public String toString() {return "Toy";}}

interface Eatable{}

public class Ex12_3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Toy> toyBox = new FruitBox<Toy>();  // 에러.
//		Box<Toy> toyBox = new Box<Toy>(); // Box<T>는 OK
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
//		fruitBox.add(new Toy());   // 에러 public void add(Fruit item)
		appleBox.add(new Apple());  // public void add(Apple item);
//		appleBox.add(new Grape());  // 에러.
		grapeBox.add(new Grape());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox.toString());	
	}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{  // Box<T>는 내부적으로 ArrayList<T>를 가지고 있다. 
	ArrayList<T> list = new ArrayList<T>();  // 저장할 공간 
	void add(T item) {list.add(item);}  // 박스에 item을 추가 
	T get(int i) {return list.get(i);}  // 박스에서 item을 꺼낼
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
