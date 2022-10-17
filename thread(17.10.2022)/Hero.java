package thread;

public class Hero extends Thread {
    public void run() {
        for (int index = 1; index < 10; index++) {
            System.out.println("hero" + index);
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}