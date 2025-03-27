public class OrderQueue {
    public int stock;
    public int sizeOfQueue;
    public LinkedQueue<CustomerOrder> orders;

    public OrderQueue(){
        LinkedQueue<CustomerOrder> orders = new LinkedQueue<CustomerOrder>();
    }

    public OrderQueue(int stock){
        LinkedQueue<CustomerOrder> orders = new LinkedQueue<CustomerOrder>();
        this.stock = stock;
        this.orders = orders;
    }

    public void addOrder(String name, String date, int quantity){
        CustomerOrder order = new CustomerOrder(name, date, quantity);
        orders.enqueue(order);
        sizeOfQueue++;
    }

    public void addStock(int stock){
        this.stock += stock;
    }

    public void sendOrder(){
        orders.getFront().shipOrder();
        stock--;
        if(orders.getFront().quantity == 0){
            orders.dequeue();
            sizeOfQueue--;
        }
    }

    public void sendAllOrders(){
        while(stock != 0){
            sendOrder();
        }
    }

    public String toString(){
        return "" + orders.getFront().quantity; 
    }

}
