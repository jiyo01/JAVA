package test;

class GBox<T>{
	T item;
	
	void setItem(T item) {
		this.item = item;
	}
	
	T getItem() {
		return item;
	}
	
	
}

public class GTest {

	public static void main(String[] args) {
		GBox<Integer> i = new GBox<Integer>();
		GBox<String> s = new GBox<String>();
		
		i.setItem(5);
		int num = i.getItem();
		System.out.println(num);
		
		s.setItem("ABC");
		String str = s.getItem();
		System.out.println(str);
		
		

	}

}
