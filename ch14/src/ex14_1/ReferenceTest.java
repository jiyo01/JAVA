package ex14_1;

import java.util.function.Function;

public class ReferenceTest {

	public static void main(String[] args) {
		// Supplier는 입력X, 출력O
//		Supplier<MyClass> s = () -> new MyClass();
//		Supplier<MyClass> s = MyClass::new; //메서드 참조
//		
//		MyClass mc = s.get();
//		System.out.println(mc);
//		System.out.println(s.get());
		
//		Function<Integer, MyClass> f = i -> new MyClass(i);
		Function<Integer, MyClass> f = MyClass::new;
		
		MyClass mc = f.apply(100);
		System.out.println(mc);
		System.out.println(mc.iv);	
		System.out.println(f.apply(200).iv);
		
//		Function<Integer, int[]> f2 = i -> new int[i];
		Function<Integer, int[]> f2 = int[]::new;
		
		int[] arr = f2.apply(100); //길이가 100인 배열 생성
		
		System.out.println("arr.length="+arr.length);
		System.out.println(f2.apply(100).length);

	}
}

class MyClass {
	int iv;
	
	MyClass(int iv){
		this.iv = iv;
	}
	
}