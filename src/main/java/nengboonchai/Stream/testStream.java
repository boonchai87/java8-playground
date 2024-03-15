package nengboonchai.Stream;

import java.util.Arrays;
import java.util.List;

public class testStream {
    public static void main(String[] args) {
         List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
              // get stream from list using stream() method
      // then apply filter
      // lastly count the result of filter
      long count = strings.stream().filter(string->string.isEmpty()).count();
      System.out.println("Empty Strings: " + count);

    }
}
