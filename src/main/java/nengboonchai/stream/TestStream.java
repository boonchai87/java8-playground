package nengboonchai.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };
    public static void main(String[] args) {
        Stream.of(arrayOfEmps);
        List empList = Arrays.asList(arrayOfEmps);
        //empList.stream().forEach(e -> e.salaryIncrement(10.0));
        //Stream empStream = list.stream();
        //System.out.println(list);
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        System.out.println(streamOfCollection);


        List<Integer> number = Arrays.asList(2,3,4,5);
        List square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);

        // collect
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List result = names.stream().sorted().collect(Collectors.toList());
        System.out.println(result);



        List<Integer> number3 = Arrays.asList(2,3,4,5);
        int even = number3.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);

        // collect method returns a set

    }
}

