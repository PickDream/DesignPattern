package Behavioral.Interpreter;

import java.util.Stack;

public class MaoExpressionPraser {

    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str){
        String[] strItemArray  = str.split(" ");
        for (String symbol:strItemArray) {
            if (OperatorUtil.isOperator(symbol)) {
                Interpreter a = stack.pop();
                Interpreter b = stack.pop();
                int result = OperatorUtil.getInterpreter(symbol, a, b).interpret();
                stack.push(new NumberInterpreter(result));
            }else {
                stack.push(new NumberInterpreter(symbol));
            }
        }
        return stack.pop().interpret();
    }
}
