package nengboonchai.string;

public class TestSplit {
    public static void main(String[] args) {
        String fruits = "banana,apple,orange,mango";
        String[] fruitArray = fruits.split(",");

        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
    }
}
