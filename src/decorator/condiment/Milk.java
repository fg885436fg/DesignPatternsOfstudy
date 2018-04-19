package decorator.condiment;

import decorator.beverage.BaseBeverage;

/**
 * 牛奶
 *
 * @author lanyubing
 * @date 2018年4月19日
 */
public class Milk extends BaseCondimentDecorator {
    BaseBeverage beverage;

    public Milk(BaseBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",牛奶";
    }

    @Override
    public double cost() {
        return 0.10;
    }
}
