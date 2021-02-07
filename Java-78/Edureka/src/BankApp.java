import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Account acc = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.Create A/C");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Balance");
			System.out.println("5.Exit");
			System.out.println("--------------------------------");
			System.out.print("enter an option: ");
			int opt = sc.nextInt();

			switch (opt) 
			{
			case 1:
				if(acc == null) {
					System.out.print("enter a/c no: ");
					long acno = sc.nextLong();
					
					System.out.print("enter name: ");
					String name = sc.next();
					
					System.out.print("enter initial deposit: ");
					float amount = sc.nextFloat();
					
					//create account instance
					acc = new Account(acno, name, amount);
					System.out.println("ACCOUNT OPENED!");
				}else {
					System.out.println("FYI: ACCOUNT IS ALREADY CREATED");
				}
				break;
			case 2:
				if(acc != null) {
					System.out.print("enter amount to deposit: ");
					float amt = sc.nextFloat();
					acc.deposit(amt);
				}
				else
					System.out.println("FYI: CREATE ACCOUNT FIRST!");				
				break;
			case 3:
				if(acc != null) {
					System.out.print("enter amount to winthdraw: ");
					float amt = sc.nextFloat();
					acc.withdraw(amt);
				}
				else
					System.out.println("FYI: CREATE ACCOUNT FIRST!");				
				break;
			case 4:
				if(acc != null)
					acc.getDetails();
				else
					System.out.println("FYI: CREATE ACCOUNT FIRST!");
				break;
			case 5:
				System.out.println("**-- BYE BYE --**");
				sc.close();
				System.exit(0); //to terminate the application
				break;
			default:
				System.out.println("INVALID OPTION... TRY AGAIN!");
			}// switch
			System.out.println("================================");
		} // while
	}
}
