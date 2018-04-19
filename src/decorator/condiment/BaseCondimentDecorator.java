package decorator.condiment;

import decorator.beverage.BaseBeverage;

/**
 * 调料类
 * @date 2018年4月19日
 * @author lanyubing
 */
public abstract class BaseCondimentDecorator extends BaseBeverage {

    @Override
    public abstract  String getDescription();
}
