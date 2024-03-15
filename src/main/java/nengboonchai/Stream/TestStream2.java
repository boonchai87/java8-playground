package nengboonchai.Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestStream2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        strings.stream().forEach(System.out::println);

        // filters
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
        // forEach
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        // map
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());

        // filter
        strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        // get count of empty string
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
        // sort
        Random random2 = new Random();
        random2.ints().limit(10).sorted().forEach(System.out::println);
        // parallel processing
        strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println(strings);

        // get count of empty string
        count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println(count);

        // collectors
        List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered2 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered);
        String mergedString = strings2.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
        // stats
        List numbers2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        Iterator<Integer> iterator = numbers2.listIterator();
        IntSummaryStatistics stats = new IntSummaryStatistics();
        while (iterator.hasNext()) { 
            // Add the integers to the IntSummaryStatistics object 
            stats.accept(iterator.next()); 
        } 

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());

        // print ten random numbers
        Random random3 = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random3.nextInt());
        }
    }
}
