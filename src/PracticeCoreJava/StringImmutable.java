package PracticeCoreJava;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " J a v a ";/*
							 * Strings are immutable and final in nature:- In memory method if we have same
							 * string name but different variable then only one memory index will be created
							 * fo both variables 2.For security purpose. AS it is final in nature we can not
							 * change the value of the string once it is assigned. 3.Optimizing and
							 * performance. 4.All wrapper classes in java are immutable and final in nature
							 */
		String str2 = "Java";
		System.out.println(str.trim());
		System.out.println(str.replaceAll("\\s",""));

	}

}
