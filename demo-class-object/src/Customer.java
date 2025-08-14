// HKTVMall
public class Customer {
  private Order[] orders; // Array of orders placed by the customer
  private Item[] items;  // Array of items available for the customer
  private double balance; // Customer's balance

  // Constructor
  public Customer(Order[] orders, Item[] items, double balance) {
    this.orders = orders; // Initialize the orders placed by the customer
    this.items = items;   // Initialize the items available for the customer
    this.balance = balance; // Set the customer's balance
  }
  // Setter for orders
  public void setOrders(Order[] orders) {
    this.orders = orders; // Set the orders placed by the customer
  }

public void setItems(Item[] items) {
  this.items = items; // Set the items available for the customer
}

  public void setBalance(double balance) {
    this.balance = balance; // Set the customer's balance
  }
  // Getter for orders
  public Order[] getOrders() {
    return this.orders; // Return the orders placed by the customer
  }

  public Item[] getItems() {
    return this.items; // Return the items available for the customer
  }

  public double getBalance() {
    return this.balance; // Return the customer's balance
  }

  // Method to calculate total price of all orders placed by the customer
  public double getTotalSpent() { //
    double totalSpent = 0.0; // Initialize total spent to 0.0
    for (Order order : orders) { // Iterate through each order
      totalSpent += order.getTotalPrice(); // Add each order's total price to the total spent
    }
    return totalSpent; // Return the total amount spent by the customer
  }
  public static void main(String[] args) {
    // Create an array of Item objects
    Item[] items = new Item[2]; // Create an array to hold 2 items
    items[0] = new Item(100.0, 2); // Create first item with price 100.0 and quantity 2
    items[1] = new Item(50.0, 3); // Create second item with price 50.0 and quantity 3

    // Create an array of Order objects
    Order[] orders = new Order[1]; // Create an array to hold 1 order
    orders[0] = new Order(); // Create a new Order object
    orders[0].setItems(items); // Set the items in the order

    Customer customer = new Customer(orders, items, 500.0); // Create a new Customer object with orders, items, and balance

    System.out.println("Total Spent: " + customer.getTotalSpent()); // Output total amount spent by the customer
    System.out.println("Customer Balance: " + customer.getBalance()); // Output customer's balance
  }
  // ! This main method is for testing purposes
  // ! It creates a Customer object with orders and items, and prints the total spent and balance.
  




}
