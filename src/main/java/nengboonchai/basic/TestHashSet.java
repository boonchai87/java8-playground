package nengboonchai.basic;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.contains("Mazda"));
        System.out.println(cars.remove("Volvo"));
        cars.clear();
        System.out.println(cars);
        for (String i : cars) {
            System.out.println(i);
        }
    }

}
