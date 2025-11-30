package nengboonchai.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformElement {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase) // Convert to uppercase
                .collect(Collectors.toList());

        System.out.println("Uppercase names: " + upperCaseNames); // Output: Uppercase names: [ALICE, BOB, CHARLIE]
    }
}
