package nengboonchai.basic;

public class TestRunable implements Runnable {
    public void run() {
        System.out.println("This code is running in a thread");
    }
    public static void main(String[] args) {
        TestRunable object = new TestRunable();
        Thread thread = new Thread(object);
        thread.start();
    }
}
