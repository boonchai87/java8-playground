package nengboonchai.methodReference;

import java.util.Arrays;
import java.util.List;

public class TestMethodReference {
    public static void main(String args[]) {
      List<Integer> numbers = Arrays.asList(1,2,4,9,8,7,3);
      System.out.println("Sorted using static method reference");
      // Use static method compare
      numbers = numbers.stream().sorted(Integer::compare).toList();
      System.out.println(numbers);

      numbers = Arrays.asList(1,2,4,9,8,7,3);
      System.out.println("Sorted using instance method reference" );
      // Use instance method compareTo
      numbers = numbers.stream().sorted(Integer::compareTo).toList();
      
      System.out.println(numbers);		
   }
}
