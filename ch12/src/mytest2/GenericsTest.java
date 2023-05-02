package mytest2;

import java.util.ArrayList;

class Product{ public String toString() {return "Product";}}
class Tv extends Product{ public String toString() {return "Tv";}}
class Audio extends Product{public String toString() {return "Audio";}}

public class GenericsTest {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product());
		list.add(new Tv());
		list.add(new Audio());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		Product p = list.get(0);
		Tv t = (Tv)list.get(1);
		Audio a = (Audio)list.get(2);
		
		System.out.println("========================");
		System.out.println(p + ", " + t + ", " + a);

	}
}
