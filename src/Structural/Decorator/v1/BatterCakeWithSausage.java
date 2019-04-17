package Structural.Decorator.v1;

/**
 * @author Maoxin
 * @ClassName BatterCakeWithSausage
 * @date 4/17/2019
 */
public class BatterCakeWithSausage extends BatterCakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc()+" 加根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
