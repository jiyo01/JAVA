import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();  // 컬렉션 스트림
		Stream<String> strStream = Stream.of(new String[]{"a", "b", "c"}); // 배열 스트림
		Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2);
		Stream<Double> randomStream = Stream.generate(Math::random);
		IntStream intStream2 = new Random().ints(5); // 난수 스트림
		
		
		
	}

}
