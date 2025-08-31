public class Main {
    private static final Object lock = new Object();
    private static final int MAX = 10;
    private static int start = 1;
    private static boolean turn = true;

    public static void main(String[] args) {

    Runnable printOne = () -> {
            while (true){
                synchronized (lock) {
                    while (!turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (start > MAX) {
                        break;
                    }
                    System.out.println(start);
                    start++;

                    turn = !turn;
                    lock.notifyAll();
                }
            }
    };
    Runnable printTwo = () -> {
            while (true){
                synchronized (lock) {
                    while (turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (start > MAX) {
                        break;
                    }
                    System.out.println(start);
                    start++;

                    turn = !turn;
                    lock.notifyAll();
                }
            }
    };

        new Thread(printOne).start();
        new Thread(printTwo).start();
    }
}

