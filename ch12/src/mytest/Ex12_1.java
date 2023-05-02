package mytest;

import java.util.ArrayList;

class Product{
	public String toString() {
		return "Product";
	}
}
class Tv extends Product{
	public String toString() {
		return "Tv";
	}
}
class Audio extends Product{
	public String toString() {
		return "Audio";
	}
}

public class Ex12_1 {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product());
		list.add(new Tv());
		list.add(new Audio());   // add(Product p)라서 다형성이 적용됨
		
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		tvList.add(new Tv());
		tvList.add(new Tv());
//		tvList.add(new Audio());  //Tv타입 객체만 저장 가능 
		
		ArrayList<Audio> audioList = new ArrayList<Audio>();
		audioList.add(new Audio());
		
		System.out.println(list);
		System.out.println(list.toString());
		System.out.println(tvList);
		System.out.println(audioList);
	}
}
