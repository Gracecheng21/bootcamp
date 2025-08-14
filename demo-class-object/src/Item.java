import java.math.BigDecimal;

public class Item {
  private double price;
  private int quantity; // quantity 件數用整數int, 用double會有小數點問題

  // Constructor
  public Item(double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  // Setter for price (must)
  public void setItem(double price) {
    this.price = price; // Set the price of the item
  }
  // this.price refers to the price attribute of the current Item object
  // ! item1.setItem(100.0); // This will set the price of the item1 object to 100.0

  // Setter for quantity
  public void setQuantity(int quantity) {
    this.quantity = quantity; // Set the quantity of the item
  }
  // this.quantity refers to the quantity attribute of the current Item object
  // ! item1.setQuantity(5); // This will set the quantity of the item1 object to 5

  // Getter for price
  public double getPrice() {
    return price;
  }

  // Getter for quantity
  public int getQuantity() {
    return quantity;
  }

  // Method to calculate total price
  public double getTotalPrice() {
    return price * quantity; // Total price = price * quantity
  }

  public double getSubTotal() {
    return BigDecimal.valueOf(this.price) //
        .multiply(BigDecimal.valueOf(this.quantity)) //
        .doubleValue(); // Calculate subtotal as price * quantity
  }

// ! subtotal (use BigDecimal for precision
  public double subtotal() {
    return BigDecimal.valueOf(this.price) //
        .multiply(BigDecimal.valueOf(this.quantity)) //
        .doubleValue(); // Calculate subtotal as price * quantity
  }


  public static void main(String[] args) {
    // Create an Item object
    // set the price of 111.11
    // set the quantity of 2
    // get price
    // get quantity
    // calculate total price, which is price * quantity
    Item item1 = new Item(111.11, 2); // Create a new Item object with price 111.11 and quantity 2
    System.out.println("Price: " + item1.getPrice()); // Output: Price: 111.11
    System.out.println("Quantity: " + item1.getQuantity()); // Output: Quantity: 2
    System.out.println("Total Price: " + item1.getTotalPrice()); // Output: Total Price: 222.22
    System.out.println("Subtotal: " + item1.getSubTotal()); // Output: Subtotal: 222.22
  }
}

