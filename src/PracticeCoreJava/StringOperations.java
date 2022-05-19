package PracticeCoreJava;

public class StringOperations {

	public static void main(String[] args) {
		String str = " Hello Mahendra How A r e y o u ";
		//change to upperCase
		System.out.println(str.toUpperCase());
		//Change to LowerCase
		System.out.println(str.toLowerCase());
		//Remove before and afterSpaces
		System.out.println(str.trim());
		//Remove between spaces
		System.out.println(str.replaceAll(" ", ""));
		//Find index of character
		System.out.println(str.indexOf("M"));
		//Find character at index
		System.out.println(str.charAt(9));
		//concat two strings
		String str2="Mahendra";
		String str3 = "Selenium";
		int a = 10;
		int b=20;
		System.out.println(str2.concat(str3));
		System.out.println(str2+str3);
		System.out.println(str2+a+str3);
		System.out.println(str2+str3+a+b);
		System.out.println(a+b+str2+str3);
		System.out.println(str2+str3+(a+b));
		System.out.println(str2.equals(str3));
		String str4[] = str.split(" ");
		for(String str5:str4) {
			System.out.println(str5.replace("H", "h").concat(str2));
		}
	}

}
