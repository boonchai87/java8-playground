package nengboonchai.optional;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.Assert.*;
public class TestOptional {
    @Test
    public void dddd(){
        Optional<String> s = Optional.of("test");
        assertEquals(Optional.of("TEST"), s.map(String::toUpperCase));

        List<String> myList = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        assertEquals(Arrays.asList("A", "B"),myList);
    }

    @Test
    public void testFlatMap(){
        List<List<String>> list = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"));
        System.out.println(list);
        System.out.println(list
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));

        List<List<Integer> > number = new ArrayList<>();

        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));

        System.out.println("List of list-" + number);

        // using flatmap() to flatten this list
        List<Integer> flatList
                = number.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        // printing the list
        System.out.println("List generate by flatMap-"
                + flatList);
    }

}
