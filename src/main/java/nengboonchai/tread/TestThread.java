package nengboonchai.tread;

public class TestThread extends Thread{
    public void run() {
        System.out.println("This code is running in a thread");
    }

        public static void main(String[] args) {
            TestThread testThread = new TestThread();
            testThread.start();
            System.out.println("This code is outside of the thread");
        }
}
