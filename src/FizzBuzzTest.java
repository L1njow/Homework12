public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz(15);

        Thread aThread = new Thread(new MyThread(fizzbuzz, 1));
        Thread bThread = new Thread(new MyThread(fizzbuzz, 2));
        Thread cThread = new Thread(new MyThread(fizzbuzz, 3));
        Thread dThread = new Thread(new MyThread(fizzbuzz, 4));

        aThread.start();
        bThread.start();
        cThread.start();
        dThread.start();
    }
}
