package decorator.beverage;

/**
 * 综合咖啡
 * @date 2018年4月19日
 * @author lanyubing
 */
public class HouseBlend extends BaseBeverage {

    public HouseBlend(){
        description="综合咖啡";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
