package PracticeCoreJava;

public class EncapsulationConcept {
private String name;
private String mobile;
private String city;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationConcept ec = new EncapsulationConcept();
		ec.setName("Mahendra");
		ec.setMobile("oneplus");
		ec.setCity("Tirupathi");
		System.out.println(ec.getName());
		System.out.println(ec.getMobile());
		System.out.println(ec.getCity());

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
