package com.cts.training.traverse;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MyApp {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		strList.add("First");
		strList.add("Second");
		strList.add("Third");
		strList.add("Fourth");
		strList.add("Fifth");
		
		System.out.println(strList);
		
	 	/*Iterator<String> iterator = strList.iterator();
	 	while(iterator.hasNext()) {
	 		String str = iterator.next();
	 		System.out.println(str);
	 		if(str.equals("Third"))
	 			iterator.remove();
	 	}*/

	 	for(String str : strList) { // remove is hidden
	 		System.out.println(str);
	 		str = str + "Pro"; // strings are immutable
	 	}
	 	
	 	System.out.println(strList);
	}

}
