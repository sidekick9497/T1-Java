package com.cgt.training.serialapp;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

class Sample implements Serializable{
	
}

class SamplePro implements Externalizable{

	int a, b, c, d;
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int sum = in.readInt();
		int product = in.readInt();
		
		this.a = sum;
		this.b = 0;
		this.c = 0;
		this.d = product;
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		int sum = this.a + this.b;
		int product = this.c * this.d;
		out.writeInt(sum);
		out.writeInt(product);
	}
	
}





public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
