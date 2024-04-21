package hw8_Stream_API;

import java.time.LocalDate;

public class Product {
    private int id;
    private String type;
    private double price;
    private boolean discount;
    private LocalDate addedDate;

    public Product(int id, String type, double price, boolean discount, LocalDate addedDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.addedDate = addedDate;
    }

    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
    public boolean isDiscount() {
        return discount;
    }
    public LocalDate getAddedDate() {
        return addedDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", localDate=" + addedDate +
                '}';
    }
}
