// HKTVMall
public class Customer {
  private Order[] orders; // Array of orders placed by the customer
  private Item[] items;  // Array of items available for the customer
  private double amount; // 
  
  // Setter for orders
  public void setOrders(Order[] orders) {
    this.orders = orders; // Set the orders placed by the customer
  }
  public void setItems(Item[] items) {
    this.items = items; // Set the items available for the customer
  }
  public void setAmount(double amount) {
    this.amount = amount; // Set the total price of the customer's orders
  }


}
