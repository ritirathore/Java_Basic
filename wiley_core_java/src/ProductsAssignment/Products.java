package ProductsAssignment;

public class Products {
	String productName;
	int productId;
	float price;
	boolean isAvailable;
	public Products(String productName, int productId, float price, boolean isAvailable) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	

}
