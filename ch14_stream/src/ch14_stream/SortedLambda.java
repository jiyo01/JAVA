package ch14_stream;

import java.util.stream.Stream;

public class SortedLambda {
    public static void main(String[] args) {

        // 람다식도 가능
        Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::print);  //CCaaabccdd

        System.out.println();

        // 메소드 참조 (위의 코드와 동일)
        strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted(String::compareTo).forEach(System.out::print);  //CCaaabccdd


    }
}
