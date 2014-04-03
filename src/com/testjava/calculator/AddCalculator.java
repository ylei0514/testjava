package com.testjava.calculator;

public class AddCalculator implements CalculatorBase {
	
	@Override
	public double calculator(double a, double b) {
		double result = 0;
		result = a+b;
		return result;
	}

	@Override
	public double calculator_three(double a, double b, double c) {
		double result = 0;
		result = a+b+c;
		return result;
	}
}
