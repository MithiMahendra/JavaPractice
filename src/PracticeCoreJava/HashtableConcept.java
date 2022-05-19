package PracticeCoreJava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1, "Mahendra");
		ht.put(11, "Autoamtion");
		ht.put(11, "Testing");
		ht.put(23, "Mahendra");
		ht.put( 2, "");
		System.out.println(ht);
		Set set = ht.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}

}
