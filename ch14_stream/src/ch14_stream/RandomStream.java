package ch14_stream;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomStream {
    public static void main(String[] args) {
    	//지정된 범위의 난수 스트림 구하기
        IntStream intStream = new Random().ints();   //무한 스트림
        intStream.limit(5).forEach(System.out::println);

        IntStream intStream2 = new Random().ints(5);  //유한 스트림
        intStream2.forEach(System.out::println);
    }
}
