package nengboonchai.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        // 1. Creating Optional instances
        String presentValue = "Hello Optional!";
        String nullValue = null;

        // Optional.of() - for non-null values. Throws NullPointerException if value is null.
        Optional<String> optionalPresent = Optional.of(presentValue);

        // Optional.ofNullable() - for values that might be null. Returns an empty Optional if null.
        Optional<String> optionalNullablePresent = Optional.ofNullable(presentValue);
        Optional<String> optionalNullableEmpty = Optional.ofNullable(nullValue);

        // Optional.empty() - explicitly creates an empty Optional.
        Optional<String> optionalEmpty = Optional.empty();

        // 2. Checking for presence and retrieving values
        System.out.println("Is optionalPresent present? " + optionalPresent.isPresent()); // true
        System.out.println("Value of optionalPresent: " + optionalPresent.get()); // Hello Optional!

        System.out.println("Is optionalNullableEmpty present? " + optionalNullableEmpty.isPresent()); // false
        // System.out.println(optionalNullableEmpty.get()); // Throws NoSuchElementException

        // 3. Providing default values
        String result1 = optionalPresent.orElse("Default Value"); // Returns "Hello Optional!"
        String result2 = optionalNullableEmpty.orElse("Default Value"); // Returns "Default Value"
        System.out.println("orElse with present value: " + result1);
        System.out.println("orElse with empty optional: " + result2);

        // orElseGet() - provides a default value from a Supplier, only evaluated if Optional is empty.
        String result3 = optionalNullableEmpty.orElseGet(() -> "Default from Supplier");
        System.out.println("orElseGet with empty optional: " + result3);

        // 4. Performing actions if value is present
        optionalPresent.ifPresent(value -> System.out.println("Value present: " + value));

        // 5. Transforming values with map()
        Optional<Integer> lengthOptional = optionalPresent.map(String::length);
        lengthOptional.ifPresent(length -> System.out.println("Length of value: " + length)); // Length of value: 15

        // 6. Filtering values
        Optional<String> filteredOptional = optionalPresent.filter(s -> s.startsWith("Hello"));
        filteredOptional.ifPresent(s -> System.out.println("Filtered value: " + s)); // Filtered value: Hello Optional!

        Optional<String> anotherFilteredOptional = optionalPresent.filter(s -> s.contains("xyz"));
        System.out.println("Is anotherFilteredOptional present? " + anotherFilteredOptional.isPresent()); // false

        // 7. Throwing exceptions if empty
        try {
            optionalNullableEmpty.orElseThrow(() -> new IllegalArgumentException("Value is missing!"));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}