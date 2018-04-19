package decorator.condiment;

import decorator.beverage.BaseBeverage;

/**
 * 摩卡咖啡(装饰者)
 * @author lanyubing
 * @date 2018年4月19日
 */
public class Mocha extends BaseCondimentDecorator {
    BaseBeverage beverage;

    public Mocha(BaseBeverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",摩卡";
    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }
}
