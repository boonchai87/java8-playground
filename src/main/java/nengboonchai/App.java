package nengboonchai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Creating an integer Arraylist to store marks
        List<Integer> marks = new ArrayList<Integer>();

        // These are marks of the students
        // Considering 5 students so input entries
        marks.add(30);
        marks.add(78);
        marks.add(26);
        marks.add(96);
        marks.add(79);

        marks.stream().map(i ->i+6).collect(Collectors.toList());
        marks.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
        System.out.println(marks.stream().findFirst());
    }
}
