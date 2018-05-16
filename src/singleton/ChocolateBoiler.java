package singleton;

/**
 * 巧克力锅炉类
 *
 * @author: lanyubing
 * @create: 2018-05-15 11:10
 **/
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static  ChocolateBoiler uniqueInstance;
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static  ChocolateBoiler getInstance(){
        if (uniqueInstance ==null){
            uniqueInstance = new ChocolateBoiler();
        }
        return  uniqueInstance;
    }

    //填入原料
    public void fill() {
        if (!isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    //排空
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    //煮沸
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //煮沸
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}

