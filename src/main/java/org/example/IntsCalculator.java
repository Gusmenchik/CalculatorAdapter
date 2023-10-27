package org.example;

import org.example.Calculator.Formula;

public class IntsCalculator implements Ints {
    private final Calculator calculator;

    public IntsCalculator() {
        calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Formula formula = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM);
        return (int) formula.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT);
        return (int) formula.result();
    }

    @Override
    public int pow(int a, int b) {
        Formula formula = calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW);
        return (int) formula.result();
    }
}

