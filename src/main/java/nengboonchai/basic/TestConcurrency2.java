package nengboonchai.basic;

public class TestConcurrency2 extends Thread{
    public static int amount = 0;
    public static void main(String[] args) {
        TestConcurrency2 thread = new TestConcurrency2();
        thread.start();
        while(thread.isAlive()) {
          System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
      }
    
      public void run() {
        amount++;
      }
}
