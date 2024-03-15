package nengboonchai.basic;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        String[] cars;

        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        Arrays.asList(cars2).stream().forEach(System.out::println);

        int[] myNum = {10, 20, 30, 40};

    }
}
