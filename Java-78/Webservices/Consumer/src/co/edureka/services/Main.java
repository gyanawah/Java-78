package co.edureka.services;

public class Main {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums numsRef = locator.getNums();
		
		System.out.println("Sum = "+ numsRef.addNum(10, 20));
		System.out.println("Diff = " + numsRef.subNum(20, 11.5f));
	}

}
