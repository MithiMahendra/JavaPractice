package PracticeCoreJava;

public class ClassC extends ClassB {
	public void show() {
		System.out.println("I am from Class C");
	}

	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.show();

	}

}
