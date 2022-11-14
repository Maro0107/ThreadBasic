public class Main {
    public static void main(String[] args) {

        TestThread thread1 = new TestThread("Thread1", 1000);
        TestThread thread2 = new TestThread("Thread2", 1000);

        thread1.start();
        thread2.start();
    }
}
