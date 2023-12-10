public class Timer {
    public static void main(String[] args) {

        Thread firstThread = new Thread(() -> {
            int counter = 1;
            while(true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Пройшло " + counter + " секунд з момента початку програми");
                counter++;
            }
        });

        Thread secondThread = new Thread(() -> {
            while(true) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Минуло 5 секунд");
            }
        });

        firstThread.start();
        secondThread.start();
    }
}