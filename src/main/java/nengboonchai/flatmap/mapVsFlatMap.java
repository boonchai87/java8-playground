package nengboonchai.flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class mapVsFlatMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> nameLengths = names.stream()
                .map(String::length) // Transforms each String to its length (an Integer)
                .collect(Collectors.toList());
        // nameLengths will be [5, 3, 7]

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Apple", "Banana"),
                Arrays.asList("Orange", "Grape", "Kiwi")
        );
        List<String> allFruits = listOfLists.stream()
                .flatMap(Collection::stream) // Transforms each List<String> into a Stream<String> and flattens them
                .collect(Collectors.toList());
        // allFruits will be ["Apple", "Banana", "Orange", "Grape", "Kiwi"]
    }
}
