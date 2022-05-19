package PracticeCoreJava;

public class ThisConcept {
	String name = "Mahendra";

	public void getData() {
		String name = "Testing";
		System.out.println("Iam form local Method : " + name);
		System.out.println("Iam Variable : " + this.name);
		System.out.println(name + " " + this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConcept tc = new ThisConcept();
		tc.getData();

	}

}
