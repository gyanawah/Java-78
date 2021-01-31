
public class Naturals_3 {
	/*---- method definition to display first 10 Natural Numbers ---*/
	static void printNaturals() 
	{
		System.out.println("First 10 Natural Numbers are:");
		int n = 1;
		while(n < 11)
		{
			if(n == 10) {
				System.out.println(n);
			}else {
				System.out.print(n+", ");
			}
			n = n + 1; //n++; 
		}		
	}//printNaturals
	
	public static void main(String[] args) {		
		 printNaturals(); //method call		
	}//main	

}
