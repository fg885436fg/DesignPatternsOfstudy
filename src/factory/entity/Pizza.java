package factory.entity;

import java.util.ArrayList;

/**
 * 披萨的实体类
 *
 * @author: lanyubing
 * @create: 2018-05-07 17:50
 **/
public class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("准备披萨 " + name);
        System.out.println("正在扔面团");
        System.out.println("正在加酱");
        System.out.println("正在加配料 ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    public void bake() {
        System.out.println("正在烘烤，需要烘烤25分钟");
    }

    public void cut() {
        System.out.println("正在把披萨切成一块块");
    }

    public void box() {
        System.out.println("把披萨饼放入盒子里");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
