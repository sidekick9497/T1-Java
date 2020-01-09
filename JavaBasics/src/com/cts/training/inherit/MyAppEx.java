package com.cts.training.inherit;

interface ITest{
	void fun();
}

class DerivedFromI implements ITest{
	public void fun() {
		
	}
	
}

public class MyAppEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITest ref;
		ref = new DerivedFromI();
	}

}



























