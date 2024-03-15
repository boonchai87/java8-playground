package nengboonchai.basic;

public class TestConcurrency extends Thread{
    public static int amount = 0;
    public static void main(String[] args) {
        TestConcurrency thread = new TestConcurrency();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
      }
    
      public void run() {
        amount++;
      }
}
