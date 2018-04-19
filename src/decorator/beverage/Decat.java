package decorator.beverage;

/**
 * 低咖啡因
 *
 * @author lanyubing
 * @date 2018年4月19日
 */
public class Decat extends BaseBeverage {

    public Decat() {
        description = "低咖啡因";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
