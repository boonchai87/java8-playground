package nengboonchai.orEles;

import java.util.Optional;

public class OrEleseExample {
    public static void main(String[] args) {
        // create a Optional
        Optional<Integer> op = Optional.ofNullable(null);

        // print value
        System.out.println("Optional: " + op);

        // orElse value
        System.out.println("Value by orElse"
                + "(100) method: "
                + op.orElse(100));
    }
}
