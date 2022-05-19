package PracticeCoreJava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter any String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		if (t.equals(s)) {
			System.out.println("Given input is Palindrome: " + t);
		} else {
			System.out.println("Given input is not a palindrome: " + t);
		}

	}

}
