// HKTVMall

import java.math.BigDecimal;

public class Customer {
  private Order[] orders; // Array of orders placed by the customer

  // 以下係自己做
  // Constructor (length object)
  public Customer(Order[] orders) {
    this.orders = new Order[0]; // set new array for address memory
  }

  // Setter for orders (不是必須，按用家所需要而寫) no setter for security
  public void setOrders(Order[] orders) { //任由用戶隨意新增order
    this.orders = orders; 
  }

  // add / remove (Alterative) 
  public void addOrder(Order newOrder) { // 由開發者控制新增order
    Order[] orders = new Order[this.orders.length + 1]; // 開新array+1
    for (int i = 0; i < this.orders.length; i++) { // for loop 抄舊array
      orders[i] = this.orders[i]; // copy舊orders to 新orders
    }
    // !
    orders[orders.length - 1] = newOrder; // 放新order去新array個尾
    this.orders = orders; // 重新定義order地址為新order
  }
  // Method Presentation
  // ! -> totalPrachasedAmount()
  // 使用double方便用家提取數字
  public double totalPrachasedAmount() {
    BigDecimal sum = BigDecimal.ONE;
    for (Order order : this.orders) {
      sum = sum.add(BigDecimal.valueOf(order.total()));
    }
    return sum.doubleValue();
  }

  // method presentation
  // -> isVip(), totalPurchasedAmount > 100,000
  public boolean isVip() {
    return this.totalPrachasedAmount() > 100_000;
  }

    // Customer A, OrderA & B
    // Customer B, OrderC

    // And with some items...

    // Customer A -> isVip -> true
    // Customer B -> isVip -> false
  
  public static void main(String[] args) {}



//  public static void main(String[] args) {
    // Create an array of Order objects
//    Order[] orders = new Order[1]; // Create an array to hold 1 order
//    orders[0] = new Order(); // Create a new Order object
//    orders[0].setItems(items); // Set the items in the order

//    Customer customer = new Customer(orders); // Create a new Customer object with orders

    // System.out.println("Total Spent: " + customer.getTotalSpent()); // Output total amount spent by the customer
    // System.out.println("Customer Balance: " + customer.getBalance()); // Output customer's balance
  }
  // ! This main method is for testing purposes
  // ! It creates a Customer object with orders and items, and prints the total spent and balance.




