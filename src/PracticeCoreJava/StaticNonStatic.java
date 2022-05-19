package PracticeCoreJava;

public class StaticNonStatic {
	String name;
	String address;
	static String city="Thirupathi";
	static String phone;
	static String number;
	static {
		phone="onceplus";
		number = "9550163010";
	}
	public StaticNonStatic(String name,String address) {
		String city = "Bangalroe";
		String phone = "redmi";
		System.out.println(name);
		System.out.println(address);
		System.out.println(this.city);
		System.out.println(phone);
		System.out.println(this.phone);
	}
	public static void getData() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStatic sns = new StaticNonStatic("Mahendra","Jeevakona");
		StaticNonStatic sns2 = new StaticNonStatic("Mithi","kranthi");
		StaticNonStatic.getData();
		System.out.println(StaticNonStatic.city="Hyd");
		
		

	}

}
