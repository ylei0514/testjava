package com.testjava;

import com.testjava.baseclass.FirstBase;
import com.testjava.myinterface.FirstInterface;
import com.testjava.myinterface.SecInterface;

public class FirstTest extends FirstBase implements FirstInterface{

	@Override
	public void print(String temp) {
		System.out.println("temp =="+temp);
	}

	@Override
	public void print_sec(int temp) {
		System.out.println("int =="+temp);
	}

	@Override
	public void base_print(String temp) {
		super.base_print(temp);
		System.out.println("first-test-print"+temp);
	}

	@Override
	public void base_print1(SecInterface si) {
		System.out.println("first-test-print1");
		si.print_you("i'm print_you");
		si.print_me();
	}
}
