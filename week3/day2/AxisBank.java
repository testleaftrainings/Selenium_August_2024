package week3.day2;

public class AxisBank implements RBI, AxisBankRules{

	

	public void dailyTranscationLimit() {
		System.out.println("Daily trascation limit is 49999");
	}

	

	public void customerAccountDetails() {
		System.out.println("Name: Gokul \n Account no: 3476123699713");
	}

	public void depositLimit() {
		System.out.println("Daily desposit limit 49999, if above kyc requires");
		
	}

	
	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
//		RBI rbi = new RBI();
		ab.dailyTranscationLimit();
		ab.customerAccountDetails();
		ab.depositLimit();
		ab.creditCard();
		ab.personalLoan();
		ab.debitCard();
		ab.getAccountBalance();
	}



	public void internetBanking() {
		System.out.println("Internet banking is optional");
	}



	public void personalLoan() {
		System.out.println("Personal loan is optional");
	}



	public void creditCard() {
		System.out.println("Credit card is optional");
	}



	public void debitCard() {
		System.out.println("Debit card is optional");
	}
	
	public void getAccountBalance() {
		System.out.println("Balance is XXXXXXXXXXXX");
	}
	
}
