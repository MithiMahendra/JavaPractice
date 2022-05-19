package PracticeCoreJava;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int num[]= {1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5};
		ArrayList<Integer> unique = new ArrayList<Integer>();
		for(int i=0;i<num.length;i++) {
			if(!unique.contains(num[i])) {
				unique.add(num[i]);
			}
		}
		System.out.println("Unique numbers: "+ unique);
		
	}

}
