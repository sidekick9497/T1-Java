package com.cts.training.traverse;

import java.util.ArrayList;
import java.util.List;

public class MyAppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StringBuffer> strList = new ArrayList<StringBuffer>();
		
		strList.add(new StringBuffer("First"));
		strList.add(new StringBuffer("Second"));
		strList.add(new StringBuffer("Third"));
		strList.add(new StringBuffer("Fourth"));
		strList.add(new StringBuffer("Fifth"));
		
		System.out.println(strList);
		
	 	/*Iterator<String> iterator = strList.iterator();
	 	while(iterator.hasNext()) {
	 		String str = iterator.next();
	 		System.out.println(str);
	 		if(str.equals("Third"))
	 			iterator.remove();
	 	}*/

	 	for(StringBuffer str : strList) { // remove is hidden
	 		System.out.println(str);
	 		str.append("Pro");
	 	}
	 	
	 	System.out.println(strList);
	}

}
