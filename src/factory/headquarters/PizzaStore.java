package factory.headquarters;

import factory.entity.Pizza;
import factory.pizzafactory.SimplePizzaFactory;

/**
 * 披萨商店
 *
 * @author: lanyubing
 * @create: 2018-05-08 16:31
 **/
public  class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
