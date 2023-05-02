package ch14_stream;
import java.util.stream.Stream;

public class IterateGenerate {
    public static void main(String[] args) {


        Stream<Integer> evenStream = Stream.iterate(0, n -> n+2);
        evenStream.limit(5).forEach(System.out::println);

        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(5).forEach(System.out::println);


    }
}
