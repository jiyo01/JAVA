import java.util.Arrays;
import java.util.function.Function;

public class MethodReferenceTest2 {

	public static void main(String[] args) {
//		Supplier<MyClass> s = () -> new MyClass();  // 람다식 
//		Supplier<MyClass> s = MyClass::new;
		
//		Function<Integer, MyClass> f = i -> new MyClass(i);
		Function<Integer, MyClass> f = MyClass::new;
		
		MyClass mc = f.apply(100);
		System.out.println(mc.iv);
		
		System.out.println(f.apply(200).iv);
		
//		Function<Integer, int[]> f2 = i -> new int[i];
		Function<Integer, int[]> f2 = int[]::new;
		int[] arr = f2.apply(100);
		System.out.println("arr.length="+arr.length);

	}
}

class MyClass{
	int iv;
	
	MyClass(int iv){
		this.iv = iv;
	}
}
