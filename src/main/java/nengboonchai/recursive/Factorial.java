package nengboonchai.recursive;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(1);
        System.out.println(result);
    }
    public static int factorial(int num){
        if( num==1)// terminate condtion
            return 1;
        else
            return num*factorial(num-1);
    }
}
