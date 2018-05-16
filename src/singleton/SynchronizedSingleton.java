package singleton;

/**
 * 经典的单例会有线程安全问题，这是线程安全的同步,问题在于，这玩意只有在第一次执行方法时，
 * 才需要同步，而不是每次执行，都要同步，这是一种累赘。
 *
 * @author: lanyubing
 * @create: 2018-05-15 11:38
 **/
public class SynchronizedSingleton {
    //记录实例
    private static EasySingleton uniqueInstance;

    public SynchronizedSingleton() {
    }

    public static synchronized EasySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new EasySingleton();
        }
        return uniqueInstance;
    }
}
