package ch14_stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        Stream<Integer> intStream = list.stream();
//        intStream.forEach(System.out::print);
//
//        intStream = list.stream();
//        intStream.forEach(System.out::print);

        Stream<String> strStream = Stream.of("a", "b", "c");
        Stream<String> strStream2 = Stream.of(new String[] {"a", "b", "c", "d"});

        String[] strArr = new String[] {"a", "b", "c", "d"};
        Stream<String> strStream3 = Stream.of(strArr);
        Stream<String> strStream4 = Arrays.stream(strArr);
        strStream.forEach(System.out::println);

        int[] intArr = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(System.out::println);
        intStream = Arrays.stream(intArr);
        System.out.println("sum=" + intStream.sum());

        Integer[] intArr2 = new Integer[] {1,2,3};
        Stream<Integer> intStream2 = Arrays.stream(intArr2);
        intStream2.forEach(System.out::print);

    }
}
