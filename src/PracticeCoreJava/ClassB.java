package PracticeCoreJava;

public class ClassB extends ClassA{
	public void show() {
		System.out.println("I am from Class B");
	}

	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.show();
	}

}
