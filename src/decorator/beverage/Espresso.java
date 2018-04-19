package decorator.beverage;

/**
 * 浓缩咖啡
 *
 * @author lanyubing
 * @date 2018年4月19日
 */
public class Espresso extends BaseBeverage {

    public Espresso() {
        description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
