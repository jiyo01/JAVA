package ch14_stream;

import java.util.stream.IntStream;

public class Range {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 5);
        IntStream intStream2 = IntStream.rangeClosed(1, 5);

        intStream.forEach(System.out::print);
        System.out.println();
        intStream2.forEach(System.out::print);
    }
}
