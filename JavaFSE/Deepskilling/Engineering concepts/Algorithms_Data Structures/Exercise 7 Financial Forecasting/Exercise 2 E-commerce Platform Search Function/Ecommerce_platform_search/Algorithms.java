package Ecommerce_platform_search;

import java.util.*;

public class Algorithms {

    /*<---- Linear Search algorithm--->*/
    public Product linearSearch(Product[] products, String productName) {
        System.out.println("\n--- Linear Search for '" + productName + "' ---");

        for (int i = 0; i < products.length; i++) {
            System.out.println("  Checking product: " + products[i].getProductName() + " (Index: " + i + ")");

            if (products[i].getProductName().equalsIgnoreCase(productName)) {
                return products[i];
            }
        }
        return null;
    }

    /*<---- Binary Search algorithm--->*/
    public Product binarySearch(Product[] products, String productName) {
        System.out.println("\n--- Binary Search for '" + productName + "' ---");

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midProductName = products[mid].getProductName();
            System.out.println("  Checking mid product: " + midProductName + " (Index: " + mid + ")");

            int compare = productName.compareToIgnoreCase(midProductName);

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null; // Product not found
    }

    public static void main(String[] args) {

        // --- Sample Products ---
        Product[] unsortedProducts = {
                new Product("P005", "Mouse", "Electronics", 25.00),
                new Product("P001", "Laptop", "Electronics", 1200.00),
                new Product("P003", "Keyboard", "Electronics", 75.00),
                new Product("P002", "Monitor", "Electronics", 300.00),
                new Product("P004", "Headphones", "Audio", 150.00),
                new Product("P006", "Webcam", "Electronics", 50.00)
        };

        Algorithms searcher = new Algorithms();

        // --- Demonstrate Linear Search ---
        System.out.println("<-Linear search examples->");

        Product foundProduct1 = searcher.linearSearch(unsortedProducts, "Keyboard");
        if (foundProduct1 != null) {
            System.out.println("Linear Search Result: FOUND " + foundProduct1);
        } else {
            System.out.println("Linear Search Result: Product not found.");
        }

        Product foundProduct2 = searcher.linearSearch(unsortedProducts, "Speaker");
        if (foundProduct2 != null) {
            System.out.println("Linear Search Result: FOUND " + foundProduct2);
        } else {
            System.out.println("Linear Search Result: Product 'Speaker' not found.");
        }

        // --- Prepare data for binary search ---
        Product[] sortedProducts = Arrays.copyOf(unsortedProducts, unsortedProducts.length);

        // Sort the array
        Arrays.sort(sortedProducts);

        // --- Demonstrate Binary Search ---
        System.out.println("<-Binary search examples->");

        Product foundProduct3 = searcher.binarySearch(sortedProducts, "Laptop");
        if (foundProduct3 != null) {
            System.out.println("Binary Search Result: FOUND " + foundProduct3);
        } else {
            System.out.println("Binary Search Result: Product not found.");
        }

        Product foundProduct4 = searcher.binarySearch(sortedProducts, "Charger");
        if (foundProduct4 != null) {
            System.out.println("Binary Search Result: FOUND " + foundProduct4);
        } else {
            System.out.println("Binary Search Result: Product 'Charger' not found.");
        }

        Product foundProduct5 = searcher.binarySearch(sortedProducts, "Webcam");
        if (foundProduct5 != null) {
            System.out.println("Binary Search Result: FOUND " + foundProduct5);
        } else {
            System.out.println("Binary Search Result: Product 'Webcam' not found.");
        }
    }
}

