package PracticeCoreJava;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
		str.add("Mahendra");
		str.add("Testing");
		str.add("Automation");
		str.add("java");
		str.add("java");
		str.add(1, "oneplus");
		System.out.println(str);
		System.out.println(str.get(1));
		System.out.println(str.remove(3));
		System.out.println(str);
		System.out.println(str.contains("Mahendra"));
		System.out.println(str.contains("Mahi"));
		

	}

}
