package decorator.condiment;

import decorator.beverage.BaseBeverage;

/**
 * 奶泡
 *
 * @author lanyubing
 * @date 2018年4月19日
 */
public class Whip extends BaseCondimentDecorator {
    BaseBeverage beverage;

    public Whip(BaseBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",奶泡";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
