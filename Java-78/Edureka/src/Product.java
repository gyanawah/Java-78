public class Product {
	private int prodId;
	private String prodName;
	private int qty;
	private float unitPrice;

	public Product(int prodId, String prodName, int qty, float unitPrice) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Product [Product ID = " + prodId + " | Product Name = " + prodName + " | Quantity = " + qty + " | Unit Price = " + unitPrice
				+ "]";
	}
	
}
