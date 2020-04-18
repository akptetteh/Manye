package com.syntax.class26;

import java.util.ArrayList;
import java.util.Arraylist;

public class ArraylistDemo {
	public static void main(String[] args) {
		ArrayList<String> arraylis=new Arraylist<>();
		//adding String Object into arraylist
		arrayList.add("John");
		arraylist.add("Gulbarhar");
		
		//access element form arraylist
		String secondElement=arrayList.get(1);
		System.out.println(secondElement);
		
		//arraylist is dynamic array
		arraylis.add("Jane");
		arraylist.add("Jame");
		//
		
		//how to get number of elements inside arraylist
		int size=arrayList.size();
		System.out.println(size);
		
		arrayList.remove("John");
		System.out.println(arrayList.size));
		
		arrayList.add("Tetteh");
		System.out.println(arrayList);
		
		arrayList.set(1, "Ahmed");
		
		how to retrieve values from arraylist 1 by ?
				for(int i=0; i<arrayList.size(); i++) {
					String element=arrayList.get(i);
					System.out.println(element);
				}
		System.out.println("-----------------------");
		for(String str:arrayList) {
			System.out.println(str);
		}
		
		
	}

}
