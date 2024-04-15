package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;
    private int orderCounter;

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
        this.orderCounter = 1;
    }

    public void add(String customerName) {
        Order newOrder = new Order(orderCounter, customerName);
        orders.add(newOrder);
        orderCounter++;
    }

    public Order deliver() {
        if (!orders.isEmpty()) {
            return orders.remove(0);
        } else {
            return null;
        }
    }

    public Order deliverById(int orderId) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getOrderId() == orderId) {
                return orders.remove(i);
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("Coffee Order Board");
        System.out.println("============= ");
        System.out.println("Order Id | Customer Name");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + " | " + order.getCustomerName());
        }
    }

    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Alex");
        board.add("Kate");
        board.add("Oliver");
        board.add("Jack");
        board.add("Anna");
        board.add("Maria");

        board.draw();

        System.out.println("\nDelivering closest order:");
        Order closestOrder = board.deliver();
        if (closestOrder != null) {
            System.out.println("Delivered order: " + closestOrder.getOrderId() + " | " + closestOrder.getCustomerName());
        } else {
            System.out.println("No orders in the queue.");
        }

        System.out.println("\nDelivering order by Id:");
        Order orderToDeliver = board.deliverById(2);
        if (orderToDeliver != null) {
            System.out.println("Delivered order: " + orderToDeliver.getOrderId() + " | " + orderToDeliver.getCustomerName());
        } else {
            System.out.println("Order not found or queue is empty.");
        }

        System.out.println("\nUpdated queue:");
        board.draw();
    }
}

