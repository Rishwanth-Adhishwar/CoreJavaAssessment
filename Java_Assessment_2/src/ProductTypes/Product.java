package ProductTypes;

//abstract class Product
abstract class Product {

	int productId;
	String productName;
	double price;

	// parametrized constructor
	public Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	// getters and setters (Concrete Methods)
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	// abstract methods
	abstract void displayInfo();
}