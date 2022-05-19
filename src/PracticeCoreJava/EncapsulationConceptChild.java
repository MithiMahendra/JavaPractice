package PracticeCoreJava;

public class EncapsulationConceptChild extends EncapsulationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationConceptChild ec = new EncapsulationConceptChild();
		ec.setName("Mithi");
		ec.setMobile("redmi");
		ec.setCity("Bangalore");
		System.out.println(ec.getName());
		System.out.println(ec.getMobile());
		System.out.println(ec.getCity());
	}

}
