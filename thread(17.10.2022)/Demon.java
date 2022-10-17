package thread;

import thread.Hero;

public class Demon implements Runnable {
    public void run() {
        for (int index = 1; index < 10; index++) {
            System.out.println("Demon " + index);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Hero hero = new Hero();
        Demon demon = new Demon();
        Thread thread = new Thread(demon);
        hero.start();
        thread.start();
    }
}