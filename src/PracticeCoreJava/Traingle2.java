package PracticeCoreJava;

public class Traingle2 {
	public void reverseTraingle() {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Traingle2 reverse = new Traingle2();
		reverse.reverseTraingle();
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
