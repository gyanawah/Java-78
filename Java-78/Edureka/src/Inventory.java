
public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product(11123,"Monitor",12, 7500f);
		System.out.println("Product ID = " + prod.getProdId());
		System.out.println("Product Name = " + prod.getProdName());
		
		System.out.println("Type of prod = " + prod.getClass().getName());
		
		System.out.println(prod); //toString()
	}
}
