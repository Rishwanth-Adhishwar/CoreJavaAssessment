package problem4StoreandProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<Product> list = new ArrayList<>();

		list.add(new Product(101, "iphone10", "Mobile", 20000, 0.2, 2));
		list.add(new Product(102, "Dell", "Laptop", 20000, 0.3, 4));
		list.add(new Product(103, "iphone13", "Mobile", 10000, 0.5, 1));
		list.add(new Product(104, "Lenovo", "Laptop", 70000, 0.8, 3));
		list.add(new Product(105, "iphone12", "Mobile", 50000, 0.5, 6));

		int choice;

		do {
			System.out.println("1. Sort by Id");
			System.out.println("2. List Mobiles with price > 40000");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				for (int i = 0; i < list.size(); i++)
				{
					for (int j = i + 1; j < list.size(); j++) 
					
					{
						if (list.get(i).id > list.get(j).id) {
							Product temp = list.get(i);
							list.set(i, list.get(j));
							list.set(j, temp);
						}
					}
				}
				
				for (Product p : list) {
					p.display();
				}
				break;

			case 2:
				for (Product p : list) {
					if ((p.category.equals("Mobile") || p.category.equals("Laptop")) && p.price > 40000) {
						p.display();
					}
				}
				break;

			case 3:
				System.out.println("Thank you!...");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 3);

	}

}
