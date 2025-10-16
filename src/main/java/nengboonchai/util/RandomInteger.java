package nengboonchai.util;

import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand1 = rand.nextInt(1000);
        System.out.println(rand1);

        System.out.println(rand.nextDouble());
    }
}
