package com.testjava.calculator;

public class MulCalculator implements CalculatorBase {

	@Override
	public double calculator(double a, double b) {
		double result;
		result = a*b;
		return result;
	}

	@Override
	public double calculator_three(double a, double b, double c) {
		double result;
		result = a*b*c;
		return result;
	}
}
