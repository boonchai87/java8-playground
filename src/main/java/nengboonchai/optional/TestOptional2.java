package nengboonchai.optional;

import java.util.Optional;

public class TestOptional2 {
    public static void main(String[] args) {
        Optional op = Optional.of(3);
        System.out.println(op.get());

        Optional op2 = Optional.ofNullable(null);
        System.out.println(op2.orElse("dddd"));
        System.out.println(op2.orElseGet(() -> "xxxx"));
    }
}
