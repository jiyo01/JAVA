import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {

	public static void main(String[] args) {
//		Function<String, Integer> f = s -> Integer.parseInt(s); //람다
		Function<String, Integer> f = Integer::parseInt;  // 메소드 참조
		
		System.out.println(f.apply("100") + 200);
	}
}