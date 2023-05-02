
public class TestClass2 {
	int iv;
	static int cv;
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod() {
//		System.out.println(iv);   // 에러!!! 인스턴스 변수를 사용할 수 없다.
		System.out.println(cv);
	}
}
