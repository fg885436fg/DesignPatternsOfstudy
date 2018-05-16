package singleton;

/**
 * 双重检查，线程安全的单例模式
 * @author: lanyubing
 * @create: 2018-05-15 13:46
 **/
public class DoubleCheckSingleton {
    private static  volatile  DoubleCheckSingleton uniqueInstance;
    private DoubleCheckSingleton(){}
    public static DoubleCheckSingleton getInstance(){
        if (uniqueInstance ==null){
            synchronized (DoubleCheckSingleton.class){
                if (uniqueInstance ==null){
                    uniqueInstance = new DoubleCheckSingleton();
                }
            }
        }
        return uniqueInstance;
    }



}
