package Behavioral.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class OperatorUtil {
    private static Map<String,Class<? extends Interpreter>> operators = new HashMap<>();
    static {
        operators.put("+",AddInterpreter.class);
        operators.put("*",MultiInterpreter.class);
    }

    public static boolean isOperator(String symbol){
        return operators.keySet().contains(symbol.trim());
    }

    public static Interpreter getInterpreter(String type,Interpreter firstArg,Interpreter secondArg){
        if ("+".equals(type)){
            return new AddInterpreter(firstArg,secondArg);
        }else if ("*".equals(type)){
            return new MultiInterpreter(firstArg,secondArg);
        }else {
            throw new UnsupportedOperationException();
        }
    }
}
