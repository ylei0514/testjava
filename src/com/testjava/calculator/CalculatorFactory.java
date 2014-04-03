package com.testjava.calculator;

public class CalculatorFactory {

	CalculatorBase cb ;
	int mType;
	
	private double ma = 0;
	private double mb = 0;
	private double mc = 0;
	
	public CalculatorFactory(int type){
		mType = type;
	}

	public void setValue(double a,double b,double c){
		mc = c;
		ma = a;
		mb = b;
	}
	
	public void setValue(double a,double b){
		ma = a;
		mb = b;
	}
	
	private final int TYPE_ADD = 1;
	private final int TYPE_MUL = 2;
	
	public double getResult(){
		double result = 0;
		switch(mType){
		case TYPE_ADD:
			cb = new AddCalculator();
			if(mc != 0){
				result = cb.calculator_three(ma, mb, mc);
				break;
			}
			result = cb.calculator(ma, mb);
			break;
		case TYPE_MUL:
			cb = new MulCalculator();
			if(mc != 0){
				result = cb.calculator_three(ma, mb, mc);
				break;
			}
			result = cb.calculator(ma, mb);
			break;
			default:
				result = 0;
		}
		return result;
	}

}
