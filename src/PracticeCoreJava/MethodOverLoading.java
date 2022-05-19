package PracticeCoreJava;

public class MethodOverLoading {
	public void getData(int a) {
		System.out.println(a);

	}

	public void getData(int a, int b) {
		System.out.println(a+b);
		
	}
	public void getData(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading mol = new MethodOverLoading();
		mol.getData(10);
		mol.getData("mahendra");
		mol.getData(10, 20);
		

	}

}
