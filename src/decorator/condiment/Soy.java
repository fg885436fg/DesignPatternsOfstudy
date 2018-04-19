package decorator.condiment;

import decorator.beverage.BaseBeverage;

/**
 * 豆浆
 * @date 2018年4月19日
 * @author lanyubing
 */
public class Soy extends BaseCondimentDecorator{
    BaseBeverage beverage;
    public Soy(BaseBeverage beverage){
        this.beverage =beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",豆浆";
    }

    @Override
    public double cost() {
        return 0.15+beverage.cost();
    }
}
