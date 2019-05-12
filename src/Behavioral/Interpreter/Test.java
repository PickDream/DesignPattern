package Behavioral.Interpreter;

public class Test {
    public static void main(String[] args) {
        String geelyInputStr = "6 100 11 + *";
        MaoExpressionPraser praser = new MaoExpressionPraser();
        System.out.println(praser.parse(geelyInputStr));
    }
}
