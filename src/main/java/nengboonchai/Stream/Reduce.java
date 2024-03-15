package nengboonchai.Stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Reduce {
    public static void main(String[] args) {
        IntStream reduced =IntStream.range(1, 4);
        reduced.forEach(System.out::println);

        IntStream reduced2 =IntStream.range(1, 4);
        OptionalInt optionalInt = reduced2.reduce((a,b)->a+b);
        optionalInt.stream().forEach(System.out::println);
        //.reduce((a, b) -> a + b);
    }
}
