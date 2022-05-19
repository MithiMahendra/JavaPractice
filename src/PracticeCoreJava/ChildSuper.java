package PracticeCoreJava;

public class ChildSuper extends ParentSuper {
	public ChildSuper() {
		super();
		String names = "Testing Practice";
		System.out.println("Iam From Child Constructor :" + names);
	}
	String name = "mithi mahendra";

	public void getData() {
		super.getData();
		System.out.println("I am from Child method: "+name);
		System.out.println("Iam from Parent Class Variable: " +super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildSuper c = new ChildSuper();
		c.getData();
		
	}

}
