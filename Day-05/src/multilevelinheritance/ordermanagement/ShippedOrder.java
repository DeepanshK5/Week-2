package multilevelinheritance.ordermanagement;

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "multilevelinheritance.ordermanagement.Order tracking number " + this.trackingNumber;
    }
}
