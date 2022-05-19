package PracticeCoreJava;

public class BMW extends Car {
	public void start() {
		System.out.println("BWM Start");
	}

	public void theftSafty() {
		System.out.println("BMW -theft safty");
	}
	public void stop() {
		System.out.println("BMW stop");
	}

	public static void main(String[] args) {
		BMW b = new BMW();// compile time polymorphism/method overriding: First it will check the methods or variables in
							// child class if not present then it will get from the parent class.
		b.start();
		b.stop();
		b.theftSafty();

	}

}
