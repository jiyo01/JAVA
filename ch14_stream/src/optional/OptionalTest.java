package optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optVal = Optional.ofNullable("abc");
        String str1 = optVal.orElse("EMPTY");
        System.out.println(str1);
    }
}
