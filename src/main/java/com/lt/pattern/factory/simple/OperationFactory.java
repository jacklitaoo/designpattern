package com.lt.pattern.factory.simple;

/**
 * @author lt
 * @date 2022/9/29 15:39
 * @describe 简单工厂
 */
public class OperationFactory {

    public static Operation createOperation(String operation) {
        Operation oper;
        switch (operation) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                oper = null;
        }
        return oper;
    }
}
