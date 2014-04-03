package com.testjava;

import com.testjava.myinterface.SecInterface;

public class SecIn implements SecInterface{

	@Override
	public void print_me() {
		System.out.println("sec_in ==i'm print_me");
	}

	@Override
	public void print_you(String temp) {
		System.out.println("sec_in =="+temp);
	}
	
}
