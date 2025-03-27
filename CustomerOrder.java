public class CustomerOrder {
    public String name;
    public String date;
    public int quantity;

    public CustomerOrder(){
        name = null;
        date = null;
        quantity = 0;
    }

    public CustomerOrder(String name, String date, int quantity){
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }

    public void shipOrder(){
        if(quantity > 0){
            quantity--;
        }
    }
}