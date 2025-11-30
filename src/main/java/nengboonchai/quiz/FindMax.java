package nengboonchai.quiz;

public class FindMax {
    public static void main(String[] args) {
        int[] numbers = {9,2,3,4,5};
        int max = 0;
        for(int i=0;i<numbers.length;i++){
            max = Math.max(max,numbers[i]);
        }
        System.out.println("Max value is "+max);
    }
}
