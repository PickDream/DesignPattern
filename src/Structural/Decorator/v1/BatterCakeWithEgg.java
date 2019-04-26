package Structural.Decorator.v1;

/**
 * @author
 * @ClassName BatterCakeWithEgg
 * @date 4/17/2019
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
