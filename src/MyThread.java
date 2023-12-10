public class MyThread extends Thread {
    private FizzBuzz fizzbuzz;
    private int threadNumber;

    public MyThread(FizzBuzz fizzbuzz, int threadNumber) {
        this.threadNumber = threadNumber;
        this.fizzbuzz = fizzbuzz;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadNumber != 4) {
            fizzbuzz.printNumbers(threadNumber);
        } else {
            fizzbuzz.number();
        }
    }
}
