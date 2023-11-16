// Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20. in mutlithread
class EvenOddPrinter implements Runnable {
    private static Object lock = new Object();
    private static int count = 1;
    private int maxCount;
    private boolean isEven;

    EvenOddPrinter(int maxCount, boolean isEven) {
        this.maxCount = maxCount;
        this.isEven = isEven;
    }

    public void run() {
        while (count <= maxCount) {
            synchronized (lock) {
                // Check if it's the turn for this thread to print
                while ((count % 2 == 0 && !isEven) || (count % 2 != 0 && isEven)) {
                    try {
                        lock.wait(); // Wait for the other thread's turn
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number and increment the count
                System.out.println(Thread.currentThread().getName() + ": " + count);
                count++;

                lock.notifyAll(); // Notify the other thread to execute
            }
        }
    }
}

public class EvenOddPrintingThreads {
    public static void main(String[] args) {
        EvenOddPrinter evenPrinter = new EvenOddPrinter(20, true);
        EvenOddPrinter oddPrinter = new EvenOddPrinter(20, false);

        Thread evenThread = new Thread(evenPrinter, "EvenThread");
        Thread oddThread = new Thread(oddPrinter, "OddThread");

        evenThread.start();
        oddThread.start();
    }
}
