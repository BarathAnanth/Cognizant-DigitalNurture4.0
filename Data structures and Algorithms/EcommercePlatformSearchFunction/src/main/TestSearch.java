package main;

public class TestSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Book", "Education")
        };

        Product result1 = LinearSearch.search(products, "Phone");
        if (result1 != null) {
            System.out.println("Linear Search Found: " + result1.productName);
        } else {
            System.out.println("Product not found in Linear Search");
        }

        Product result2 = BinarySearch.search(products, "Phone");
        if (result2 != null) {
            System.out.println("Binary Search Found: " + result2.productName);
        } else {
            System.out.println("Product not found in Binary Search");
        }
    }
}

