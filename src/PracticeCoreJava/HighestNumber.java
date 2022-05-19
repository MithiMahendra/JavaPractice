package PracticeCoreJava;

import java.util.ArrayList;

public class HighestNumber {
	public void StrOps() {
		String str1 = "Mahe n d r a";
		System.out.println(str1.substring(2));
		
		
	}

	public static void main(String[] args) {
		HighestNumber hn = new HighestNumber();
		hn.StrOps();
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(2);
		a.add(3);
		a.add(9);
		a.add(10);
		int k=0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)>k) {
				k=a.get(i);
				
			}
			
		}
		System.out.println(k);
		
	}

}
