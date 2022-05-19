package PracticeCoreJava;

public class MethodOverriding extends MethodOverLoading{
	public void getData(int a) {
		super.getData(a);
		System.out.println(a);
	}
	public void getData(String name,String mobile) {
		System.out.println(name+mobile);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding mor = new MethodOverriding();
		mor.getData(10);
		mor.getData("Mahendra", "Testing");
	}

}
