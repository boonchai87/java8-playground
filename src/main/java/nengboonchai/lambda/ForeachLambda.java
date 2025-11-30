package nengboonchai.lambda;

import java.util.Arrays;

public class ForeachLambda {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        // foreach แบบเดิม
        for (String s : arr) {
            System.out.println(s);
        }
        // foreach แบบ Lambda
        Arrays.asList(arr).forEach(System.out::println);
    }
}
