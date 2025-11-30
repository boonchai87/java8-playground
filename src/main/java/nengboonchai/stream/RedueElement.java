package nengboonchai.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class RedueElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> sum = numbers.stream()
                .reduce(Integer::sum); // Sum all elements

        sum.ifPresent(s -> System.out.println("Sum: " + s)); // Output: Sum: 15

        //
        int reduced =
                IntStream.range(1, 4).reduce(0, (a, b) -> a + b );
        System.out.println(reduced);

    }
}
