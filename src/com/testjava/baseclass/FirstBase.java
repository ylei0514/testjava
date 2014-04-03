package com.testjava.baseclass;

import com.testjava.myinterface.SecInterface;

public abstract class FirstBase {

	public void base_print(String temp){
		System.out.println("base-class-print=="+temp);
	}
	
	public abstract void base_print1(SecInterface si);
}
