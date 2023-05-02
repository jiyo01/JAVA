
public class Ex14_0 {

	public static void main(String[] args) {
//		Object obj = (a, b) -> a > b ? a : b  // 람다식은 익명객체라서 참조변수로 다뤄야한다. 
		
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		
		//int value = obj.max(3, 5);  // obj의 타입은 Object. Object클래스에는 max()메서드가 없다.
	}
}
 