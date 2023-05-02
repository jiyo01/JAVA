import java.util.function.Function;

public class Reference {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> Integer.parseInt(s);  //람다식
		System.out.println(f.apply("100"));
		
		Function<String, Integer> f2 = Integer::parseInt;  //메소드 참조
		System.out.println(f2.apply("100"));
	}
}
