package ch14_stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sorted4 {
    public static void main(String[] args) {
        // 길이 순 정렬
        Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted(Comparator.comparing(String::length)).forEach(System.out::print);  //bddCCccaaa

        System.out.println();

        // no오토박싱
        strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted(Comparator.comparingInt(String::length)).forEach(System.out::print);  //bddCCccaaa
    }
}
