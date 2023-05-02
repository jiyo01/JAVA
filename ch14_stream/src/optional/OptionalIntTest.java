package optional;

import java.util.OptionalInt;

public class OptionalIntTest {
    public static void main(String[] args) {
        OptionalInt opt = OptionalInt.of(0);
        OptionalInt opt2 = OptionalInt.empty();

        System.out.println(opt.isPresent());  // true
        System.out.println(opt2.isPresent()); // false

        System.out.println(opt.getAsInt());  // 0
        System.out.println(opt2.getAsInt());  // 예외 발생

        System.out.println(opt.equals(opt2));  // false
    }
}
