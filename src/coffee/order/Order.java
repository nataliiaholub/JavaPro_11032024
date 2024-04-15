package coffee.order;

class Order {
    private int orderNumber;
    private String customerName;

    public Order(int orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
    }

    public int getOrderId() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}