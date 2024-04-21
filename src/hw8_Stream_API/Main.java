package hw8_Stream_API;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Book", 120, true, LocalDate.of(2024, 2, 3)));
        products.add(new Product(2, "Book", 260, false, LocalDate.of(2024, 2, 2)));
        products.add(new Product(3, "Cup", 50, true, LocalDate.of(2024, 1, 15)));
        products.add(new Product(4, "Cup", 25, true, LocalDate.of(2023, 1, 15)));
        products.add(new Product(5, "Book", 280, true, LocalDate.of(2023, 1, 3)));
        products.add(new Product(6, "Book", 45, true, LocalDate.of(2023, 1, 5)));
        products.add(new Product(7, "Book", 65, true, LocalDate.of(2024, 1, 5)));
        products.add(new Product(8, "Book", 50, true, LocalDate.of(2024, 1, 10)));

        // Task 1.2 Expensive Books
        List<Product> expensiveBooks = products.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());

        System.out.println("Expensive Books: " + expensiveBooks);

    // Task 2.2 Discounted Books
    List<Product> discountedBooks = products.stream()
            .filter(product -> product.getType().equals("Book") && product.isDiscount())
            .map(product -> new Product(product.getId(), product.getType(), product.getPrice() * 0.9, false, product.getAddedDate()))
            .collect(Collectors.toList());

        System.out.println("Discounted Books: " + discountedBooks);

    // Task 3.2 Cheapest Book
        try {
        Product cheapestBook = products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new NoSuchElementException("Product [category: Book] not found"));

        System.out.println("Cheapest Book: " + cheapestBook);
    } catch (NoSuchElementException e) {
        System.out.println(e.getMessage());
    }

    // Task 4.2 Last three added products
    List<Product> lastThreeAdded = products.stream()
            .sorted(Comparator.comparing(Product::getAddedDate).reversed())
            .limit(3)
            .collect(Collectors.toList());

        System.out.println("Last three added products: " + lastThreeAdded);

    // Task 5.2 Total cost of eligible products
    double totalCost = products.stream()
            .filter(product -> product.getAddedDate().getYear() == LocalDate.now().getYear())
            .filter(product -> product.getType().equals("Book"))
            .filter(product -> product.getPrice() <= 75)
            .mapToDouble(Product::getPrice)
            .sum();

        System.out.println("Total cost of eligible products: " + totalCost);

    // Task 6.2 Grouped by type products
    Map<String, List<Product>> groupedByType = products.stream()
            .collect(Collectors.groupingBy(Product::getType));

        System.out.println("Grouped by type: " + groupedByType);
}
}
