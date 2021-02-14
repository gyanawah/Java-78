package co.edureka.except;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		String isInQueue = "Y";
		
		while(isInQueue.equalsIgnoreCase("Y")) {
			try {
				System.out.print("enter age of voter: ");
				int age = sc.nextInt();
				if(age<18)
					throw new InvalidAgeException("age should be >= 18");
				System.out.println("VOTING DONE!");
			}catch(Exception ex) {
				System.out.println("Exception : "+ ex.toString());
			}
			System.out.print("Any Voter in Queue: ");
			isInQueue = sc.next();
		}//while
		System.out.println("VOTING COMPLETED!");
	}
}
