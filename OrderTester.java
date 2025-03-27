public class OrderTester {
    public static void main(String[] args) {
        OrderQueue orders = new OrderQueue(14);
        orders.addOrder(null,  null, 5);
        orders.addOrder(null,  null, 5);
        orders.addOrder(null,  null, 8);
        System.out.println(orders);
        orders.sendAllOrders();
        System.out.println(orders);
        orders.addStock(10);
        orders.addOrder(null,  null, 3);
        orders.addOrder(null,  null, 3);
        orders.addOrder(null,  null, 5);
        orders.sendAllOrders();
        System.out.println(orders);
    }
}
