package PracticeCoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Mahendra");
		hm.put(11, "Autoamtion");
		hm.put(11, "Testing");
		hm.put(23, "Mahendra");
		hm.put(23,null);
		System.out.println(hm);
		Set set = hm.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}

}
