package nengboonchai.orEles;

import java.util.Optional;

public class OptinalOrElesGetExample {
    public static void main(String[] args) {
        Optional<String> optionalWithValue = Optional.of("Hello");
        String result1 = optionalWithValue.orElseGet(() -> getDefaultMessage());
    }
    private static String getDefaultMessage() {
        System.out.println("Generating default message..."); // This will only print if orElseGet's Supplier is invoked
        return "Default Message";
    }
}
