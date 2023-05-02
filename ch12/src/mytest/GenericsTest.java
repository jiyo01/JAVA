package mytest;

class Box{  //일반 클래스
	Object item;
	
	void setItem(Object item) {
		this.item = item;
	}
	
	Object getItem() {
		return item; 
	}

}

public class GenericsTest {

	public static void main(String[] args) {
		Box b = new Box();
		b.setItem(new Object());
		b.setItem("ABC");
		
		String s = (String)b.getItem();

	}

}
