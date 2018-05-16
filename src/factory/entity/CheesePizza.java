package factory.entity;

/**
 * @author: lanyubing
 * @create: 2018-05-07 18:25
 **/
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
