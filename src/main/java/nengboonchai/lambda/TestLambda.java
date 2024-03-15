package nengboonchai.lambda;

public class TestLambda {
    public static void main(String[] args) {
        // Interface implementation using anonymous class
        Calculator sum = new Calculator() {
           @Override
           public int operate(int a, int b) {// implementation
              return a + b;
           }
        };
        int result = sum.operate(2,3);
        System.out.println(result);	   
  
        // Interface implementation using lambda expression
        Calculator sum1 = (a,b) -> a - b;
        result = sum1.operate(2,3);
        System.out.println(result);
     }  
  
     interface Calculator {
        int operate(int a, int b);
     }
}
