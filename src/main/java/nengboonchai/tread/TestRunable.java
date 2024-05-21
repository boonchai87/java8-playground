package nengboonchai.tread;

public class TestRunable implements Runnable {
    public void run() {
        System.out.println("Thread has ended");
    }
    public static void main(String[] args) {
        TestRunable ex = new TestRunable();
        Thread t1 = new Thread(ex);
        t1.start();
        System.out.println("Hi");
    }
}