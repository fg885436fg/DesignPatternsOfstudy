package singleton;

/**
 * 探究volatile关键字，它只能保持可见性，不能保持原子性
 *
 *
 * @author: lanyubing
 * @create: 2018-05-15 14:04
 **/
public class VolatileTest {
    public volatile int inc = 0;

    public synchronized void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final VolatileTest test = new VolatileTest();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    test.increase();
                }
            }).start();
        }

        //保证前面的线程都执行完
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println(test.inc);
    }
}
