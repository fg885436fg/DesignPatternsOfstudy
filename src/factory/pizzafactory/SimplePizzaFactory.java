package factory.pizzafactory;

import factory.entity.CheesePizza;
import factory.entity.Pizza;
import factory.entity.VeggiePizza;

/**
 * 简单的工厂
 * @author: lanyubing
 * @create: 2018-05-07 17:48
 **/
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("peopernoi")) {
            
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
