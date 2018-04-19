package decorator.beverage;

/**
 * 深焙咖啡
 *
 * @author lanyubing
 * @date 2018年4月19日
 */
public class DarkRoast extends BaseBeverage {

    public DarkRoast() {
        description = "深焙咖啡";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
