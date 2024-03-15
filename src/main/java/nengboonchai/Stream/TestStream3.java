package nengboonchai.Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream3 {
    //https://www.baeldung.com/java-8-streams
    public static void main(String[] args) {
        Stream<String> streamEmpty = Stream.empty();
        System.out.println(streamEmpty);

        // stream of collection
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        streamOfArrayFull.forEach(System.out::println);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        streamOfArrayPart.forEach(System.out::println);

        // Stream<String> stream = 
        // Stream.of("a", "b", "c").filter(element -> element.contains("b"));
        // Optional<String> anyElement = stream.findAny();
        // System.out.println(anyElement);

        // Optional<String> firstElement = stream.findFirst();// Java 8 streams can’t be reused.
        
        List<String> elements =
        Stream.of("a", "b", "c").filter(element -> element.contains("b"))
            .collect(Collectors.toList());
        Optional<String> anyElement = elements.stream().findAny();
        Optional<String> firstElement = elements.stream().findFirst();

        List<String> list = Arrays.asList("abc1", "xyz2", "rts3");
long size = list.stream().skip(1).map(element -> element.substring(0, 3)).sorted().count();
list.stream().skip(1).map(element -> element.substring(0, 3)).sorted().forEach(System.out::println);
    System.out.println(size);
    }
    public static Stream<String>  streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();


    }
}
