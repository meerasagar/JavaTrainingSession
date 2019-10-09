package abstraction;

public class HDFC extends Bank {

	@Override
	public void loan() {
		
		System.out.println("HDFC Loan");
		
	}
	
	public static void main(String[] args) {
		
		HDFC obj = new HDFC();
		obj.loan();
		obj.debit();
		obj.credit();
	}

}
