public class Account 
{
	long acno;
	String name;
	float bal;

	public Account() {}

	public Account(long acno, String name, float bal) {
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	/*--- deposit method definition --- */
	void deposit(float amt) {
		this.bal += amt;
		System.out.println("Rs."+amt+" credited | Balance: "+this.bal);
	}
	
	/*--- withdraw method definition --- */
	void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal -= amt;
			System.out.println("Rs."+amt+" debited | Balance: "+this.bal);
		}else {
			System.out.println("ERROR: INSUFFICIENT BALANCE");
		}		
	}
	
	/*--- method to show the account details ---*/
	void getDetails() {
		System.out.println("A/C No: "+this.acno+" | NAME: "+this.name+" | BALANCE: "+this.bal);
	}
}
