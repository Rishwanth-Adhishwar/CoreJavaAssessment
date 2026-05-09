package ProductTypes;

//Inherited class
class ElectronicProduct extends Product {

	int warrantyPeriod;

//parameterized constructor
	public ElectronicProduct(int productId, String productName, double price, int warrantyPeriod) {
		super(productId, productName, price);
		this.warrantyPeriod = warrantyPeriod;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	void displayInfo() {
		System.out.println("ELECTRONIC PRODUCT INFORMATION:");
		System.out.println("Productid : " + productId);
		System.out.println("ProductName : " + productName);
		System.out.println("Price : " + price);
		System.out.println("Warranty Period : " + warrantyPeriod);
	}
}