package PracticeCoreJava;

public class ConstructorConcepts {
	
	public ConstructorConcepts() {//Default Constructor
		System.out.println("Iam from Default Constructor");
	}
	public ConstructorConcepts(int a) {
		System.out.println("Iam from Intiger Constructor : " + a);
	}
	public ConstructorConcepts(String name) {
		System.out.println("Iam from String Constructor : " + name);
	}

	public void getData() {
		System.out.println("I am from method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcepts cc = new ConstructorConcepts();
		ConstructorConcepts ccString = new ConstructorConcepts("Mahendra");
		cc.getData();
	}

}
