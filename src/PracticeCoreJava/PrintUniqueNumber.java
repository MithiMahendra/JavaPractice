package PracticeCoreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintUniqueNumber {

	public static void countLetters() {
		String str = "mahendramahendramahendra";
		char[] chars = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for (Character ch : chars) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		Set<Character> keys = charMap.keySet();
		for (Character ch : keys) {
			System.out.println("Character " + ch + " Repeating " + charMap.get(ch) + " Times.");

		}
	}

	public static void main(String[] args) {
		PrintUniqueNumber.countLetters();
		int a[] = { 1, 2, 2, 1, 5, 6, 5, 2, 9, 4, 5, 9,6 };
		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				if (k == 1) {
					System.out.println("Unique Number is : " + a[i]);
				}
			}
		}
	}

}
