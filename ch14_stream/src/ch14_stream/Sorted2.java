package ch14_stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sorted2 {
    public static void main(String[] args) {


        // 기본 정렬의 역순
        Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted(Comparator.reverseOrder()).forEach(System.out::print);  //ddccbaaaCC

        System.out.println();

        strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted(Comparator.<String>naturalOrder().reversed()).forEach(System.out::print); //ddccbaaaCC


    }
}
