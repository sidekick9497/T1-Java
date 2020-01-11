package com.cts.training.convert;

import java.util.Arrays;
import java.util.List;

public class MyAppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sarr[] = new String[] { "First", "Second", "Third", "Fourth"};
		System.out.println(Arrays.toString(sarr));
		
		// convert to collection object (returns a clone)
		List<String> strList =  Arrays.asList(sarr);
		
		System.out.println(strList);
		
		strList.set(2, "NewValue"); // Third replaced by NewValue (list)
		sarr[3] = "Check"; // Fourth Replaced by Check (array)
		
		System.out.println("LIST : " + strList);
		System.out.println("ARRAY : " + Arrays.toString(sarr));
		
	}

}
