package ch14_stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sorted {
    public static void main(String[] args) {
        // 기본 정렬
        Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted().forEach(System.out::print);   //CCaaabccdd

        System.out.println();

        strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted(Comparator.naturalOrder()).forEach(System.out::print);  //CCaaabccdd
    }
}
