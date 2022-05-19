package collections;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		//Storing raw data (i.e numbers,strings,double data etc)
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(12);
		ar.add(12.3);
		ar.add("hello");
		System.out.println(ar);
		//Storing generic data
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Mahendra");
		strList.add("Selenium");
		strList.add("java");
		strList.add("testing");
		strList.add("collections");
		System.out.println(strList);
		//To get the value of index
		System.out.println(strList.indexOf("java"));
		
		
		
	}

}
