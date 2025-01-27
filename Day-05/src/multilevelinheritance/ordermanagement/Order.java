package multilevelinheritance.ordermanagement;

class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "multilevelinheritance.ordermanagement.Order placed on " + this.orderDate;
    }
}
