package nengboonchai.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public class TestFilter {
    public static void main(String[] args) {
        Stream<String> steam = Stream.of("asdfads", "bddd", "cxxx");
        Optional<String> anyElement = steam.filter(element -> element.contains("b")).findAny();
        System.out.println(anyElement.get());
    }
}
