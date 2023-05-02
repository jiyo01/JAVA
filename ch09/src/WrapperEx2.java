
public class WrapperEx2 {

	public static void main(String[] args) {
		// 문자열을 숫자로 바꾸기		
		// int i = Integer.parseInt("100");
		
		System.out.println("i=" + Integer.parseInt("100"));
		System.out.println("i=" + Integer.parseInt("100", 10));
		System.out.println("i=" + Integer.parseInt("100", 2));
		System.out.println("i=" + Integer.parseInt("FF", 16));
	}
}
