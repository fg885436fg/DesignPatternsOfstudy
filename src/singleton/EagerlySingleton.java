package singleton;

/**
 * 饿汉的单例模式，用于解决SynchronizedSingleton的性能问题。
 *
 * @author: lanyubing
 * @create: 2018-05-15 11:46
 **/
public class EagerlySingleton {
    private static EagerlySingleton uniqueInstance = new EagerlySingleton();
    private EagerlySingleton(){}
    public static EagerlySingleton getInstance(){
        return uniqueInstance;
    }
}
