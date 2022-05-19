package PracticeCoreJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Mahendra");
		hs.add("Testing");
		hs.add("Autoamtion");
		hs.add("java");
		hs.add("java");
		hs.remove("Mahendra");
		System.out.println(hs);

		Iterator<String> str = hs.iterator();
		while (str.hasNext()) {
			System.out.println(str.next());
		}

	}

}
