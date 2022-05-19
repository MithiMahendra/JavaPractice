package PracticeCoreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountDuplicateChars {

	public static void main(String[] args) {
		System.out.println("Enter any String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] chars = str.replaceAll("\\s", "").toCharArray();
		Map<Character,Integer> charMap = new HashMap<>();
		for(Character ch:chars) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		Set<Character> keys = charMap.keySet();
		for(Character key:keys) {
			System.out.println("Character "+ key+ " Repeats : "+ charMap.get(key)+ " Times");
		}
	}

}
