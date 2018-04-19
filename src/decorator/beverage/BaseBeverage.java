package decorator.beverage;

/**饮料抽象类
 * @date 2018年4月19日
 * @author lanyubing
 */
public abstract class BaseBeverage {
    String description ="未知饮料";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
