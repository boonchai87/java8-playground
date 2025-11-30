package nengboonchai.stream;

import java.util.Arrays;
import java.util.List;

public class TestForEach {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "blue");

        colors.stream()
                .forEach(System.out::println);
    }
}
