package Behavioral.Interpreter;

public class AddInterpreter implements Interpreter {

    private Interpreter firstExpression,secondExpression;

    public AddInterpreter(Interpreter firstExpression,Interpreter secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }
    @Override
    public int interpret() {
        return firstExpression.interpret()+secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
