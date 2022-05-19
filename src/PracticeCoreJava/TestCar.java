package PracticeCoreJava;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.theftSafty();
		b.start();
		Car c = new Car();
		c.start();
		Car d = new BMW();//top casting or dynamic polymorphism
		d.start();
		d.stop();
		BMW e = (BMW) new Car();//Down casting: run time polymorphism. It will throw classcastexception at run time.
		e.engine();
		
		
	}

}
