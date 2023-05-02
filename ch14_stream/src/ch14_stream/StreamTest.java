package ch14_stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();  //list를 소스로 하는 스트림 생성
        intStream.forEach(System.out::print);

//        intStream.forEach(System.out::print);
//        에러. intStream에 대해서 최종연산을 수행했으므로 스트림이 닫혔다.

        intStream = list.stream();
        intStream.forEach(System.out::print);
    }
}


