class ICICI implements Bank 
{
	public void deposit(float amt){
		System.out.println("Depositing Rs."+amt+" @ ICICI");
	}

	public void withdraw(float amt){
		System.out.println("Withdrawing Rs."+amt+" from ICICI");
	}
}