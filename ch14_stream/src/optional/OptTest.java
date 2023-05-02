package optional;

import java.util.Optional;

public class OptTest {
    public static void main(String[] args) {
//      Optional<String> opt = null;  // 에러 안남. 하지만 바람직하지 않음
        Optional<String> opt = Optional.empty();

        System.out.println("opt=" + opt);
//      System.out.println("opt=" + opt.get()); // null이면 예외발생

        String str = "";
        str = opt.orElse("EMPTY");  // Optional에 저장된 값이 null이면 "EMPTY" 반환
        System.out.println("str=" + str);


    }
}
