import java.util.function.Function;

public class Ex14_00 {

	public static void main(String[] args) {
		Function<String,Integer> f = (String s) -> Integer.parseInt(s);
		System.out.println(f.apply("100"));
		
		Function<String,Integer> f2 = Integer::parseInt;
		System.out.println(f2.apply("123"));
		
		Function<String,Integer> f3 = (String s) -> Integer.parseInt(s);
		System.out.println(f3.apply("456"));

	}

}
