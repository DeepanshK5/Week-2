package multilevelinheritance.ordermanagement;

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "multilevelinheritance.ordermanagement.Order delivered on " + this.deliveryDate;
    }
}
