package testthreads.main;

public class TestThreads {

    public static void main(String[] args) {
        new Test("Thread 1", 1000);
        new Test("Thread 2", 900);
        new Test("Thread 3", 700);
        new Test("Thread 4", 10);
        new Test("Thread 5", 400);
    }
}
