package com.sk.service;

import com.sk.service.interfaces.IMathOperations;

    //make MathOperationsImpl class which implement IMathOperations and declarate what this class do
public class MathOperationsImpl implements IMathOperations {
    //calculateResult gets info from boolean(radiobuttons) and entered value in valueField as string parse to double

    protected double calculateResult(boolean multiply, String text) {
        double tax = 1.23;
        double value = Double.parseDouble(text);

        return multiply ? multiply(value, tax) : divide(value, tax);
    }
    /**
     *  Make multiply
     * @param firstValue - first factor
     * @param secondValue - second factor
     *
     * @return floating point number
     */
    public double multiply(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    /**
     * Make divide
     * @param firstValue - divident
     * @param secondValue - divider
     *
     * @return floating point number
     */
    public double divide(double firstValue, double secondValue) {
        return firstValue / secondValue;
    }
}


