package PracticeCoreJava;

public class ICICIBank extends ICICISubbrach implements USBank, BrazilBank {

	public static void main(String[] args) {
		ICICIBank ic = new ICICIBank();
		ic.atm();
		ic.credit();
		ic.debit();
		ic.check();
		ic.check();
		ic.money();
	}
	public void money() {
		System.out.println("ICICI Money");
	}

	@Override
	public void credit() {
		System.out.println("USBank Credit");
	}

	@Override
	public void debit() {
		System.out.println("USBank Debit");

	}

	@Override
	public void moneyTransfer() {
		System.out.println("USBank Money Transfer");

	}

	@Override
	public void atm() {
		System.out.println("USBank ATM");

	}

	@Override
	public void check() {
		System.out.println("Brazil Bank check");
	}

	@Override
	public void moneyTransfer2() {
		System.out.println("Brazil bank transfer");
	}

}
