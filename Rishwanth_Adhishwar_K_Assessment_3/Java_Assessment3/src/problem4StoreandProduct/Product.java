package problem4StoreandProduct;

public class Product {
	int id;
	String name;
	String category;
	double price;
	double discount;
	int quantity;

	Product(int id, String name, String category, double price, double discount, int quantity) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
	}

	void display() {
		System.out.println("ID: "+id +",Name: "  + name + ",Category: " + category + " Price: " + price + " Discount: " + discount + ",Quantity: " + quantity);
	}
}
