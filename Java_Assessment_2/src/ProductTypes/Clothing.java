package ProductTypes;

//Inherited class
class ClothingProduct extends Product {

	String size;
	String material;

	// parameterized constructor
	public ClothingProduct(int productId, String productName, double price, String size, String material) {
		super(productId, productName, price);
		this.size = size;
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}

	void displayInfo() {
		System.out.println("\nCLOTHING PRODUCT INFORMATION:");
		System.out.println("Productid : " + productId);
		System.out.println("ProductName : " + productName);
		System.out.println("Price : " + price);
		System.out.println("Size : " + size);
		System.out.println("Material : " + material);
	}
}