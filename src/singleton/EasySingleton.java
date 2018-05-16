package singleton;

/**
 * 经典的单例模式
 *
 * @author: lanyubing
 * @create: 2018-05-15 10:28
 **/
public class EasySingleton {
    //记录实例
    private static EasySingleton uniqueInstance;

    public EasySingleton() {
    }
    public static EasySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new EasySingleton();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        EasySingleton easySingleton =   EasySingleton.getInstance();
        EasySingleton easySingletona =   EasySingleton.getInstance();
        EasySingleton easySingletonb =   EasySingleton.getInstance();
        EasySingleton easySingletonc =   EasySingleton.getInstance();
    }
}
