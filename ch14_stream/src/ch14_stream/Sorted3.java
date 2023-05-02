package ch14_stream;

import java.util.stream.Stream;

public class Sorted3 {
    public static void main(String[] args) {

        // 대소문자 구문안함
        Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::print);  //aaabCCccdd

        System.out.println();

        // reversed() 디폴트 메소드 사용해서 위 정렬의 역순
        strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(System.out::print);  //ddCCccbaaa


    }
}
