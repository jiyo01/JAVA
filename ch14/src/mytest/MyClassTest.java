package mytest;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		System.out.println(m.i);
		
		MyClass m2 = new MyClass(10);
		System.out.println(m2.i);
		
		System.out.println(m.myMethod(100));
		System.out.println(m2.myMethod(100));

	}
}

class MyClass {
	int i;
	
	public MyClass() {
		this.i = 5;
	}
	
	public MyClass(int i) {
		this.i = i;
	}
	
	public int myMethod(int i) {
		return this.i + i;
	}
}
