import java.util.function.Predicate;

public class LambdaEx {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);  //false
		
		Predicate<String> p = Predicate.isEqual(str1);
		boolean result = p.test(str2);
		System.out.println(result);   //true 
		
		// 위에 두 문장을 한줄로
		boolean result2 = Predicate.isEqual(str1).test(str2); 
		System.out.println(result2);  //true
		
		// 위와 똑같은 문장이다. equals()메서드를 사용
		boolean result3 = str1.equals(str2);
		System.out.println(result3);  //true
	}
}
