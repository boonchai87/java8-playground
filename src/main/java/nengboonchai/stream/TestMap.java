package nengboonchai.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestMap {
    public static void main(String[] args) {
        // forEach
        List<Integer> number2 = Arrays.asList(2,3,4,5);
        number2.stream().map(x->x*x).forEach(y->System.out.println(y));
        number2.stream().map(x->x*x).forEach(System.out::println);

        // convert to list
        List<Integer> number3 = number2.stream().map((x)->x*x).collect(Collectors.toList());
        System.out.println(number3);

        // forEach
        List<Integer> number = Arrays.asList(2,3,4,5);
        Set<Integer> squareSet
                = number.stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
    }
}
