package factory.branchstore;

import factory.entity.Pizza;
import factory.pizzafactory.SimplePizzaFactory;

/**
 * 披萨商店
 *
 * @author: lanyubing
 * @create: 2018-05-08 16:31
 **/
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract Pizza createPizza(String type);
}
