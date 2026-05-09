package ProductTypes;

public class Main {

    public static void main(String[] args) {

        ElectronicProduct e1 = new ElectronicProduct(201, "Laptop", 1200.0, 12);
        ClothingProduct c1 = new ClothingProduct(301, "T-Shirt", 25.0, "M", "Cotton");

        e1.displayInfo();
        c1.displayInfo();
    }
}