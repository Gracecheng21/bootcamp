// ! One to Many
public class Order {
  private Item[] items; // Array of items in the order

  // setter, getter
  // ! 現實中，呢條setter可能會有驗證邏輯，例如檢查items是否為空
  public void setItems(Item[] items) {
    this.items = items; // Set the items in the order
  }

  // !
  public void addItem(Item item) {
    // Add an item to the order
    if (items == null) {
      items = new Item[0];
    }
    Item[] newItems = new Item[items.length + 1]; // Create a new array with one more item
    System.arraycopy(items, 0, newItems, 0, items.length); // Copy existing items to the new array
    newItems[items.length] = item; // Add the new item at the end
    this.items = newItems; // Update the items in the order
  }

  public Item[] getItems() {
    return this.items; // Return the items in the order
  }

  // Method to calculate total price of the order
  public double getTotalPrice() {
    double total = 0.0; // Initialize total price to 0.0
    for (Item item : items) { //
      total += item.getTotalPrice(); // Add each item's total price to the total
    }
    return total; // Return the total price of the order
  }

public static void main(String[] args) {
  // Create an array of Item objects （現實中不合理，應該用addItem方法）
  Item[] items = new Item[2]; // Create an array to hold 2 items
  items[0] = new Item(100.0, 2); // Create first item with price 100.0 and quantity 2
  items[1] = new Item(50.0, 3); // Create second item with price 50.0 and quantity 3

  Order order = new Order(); // Create a new Order object
  order.setItems(items); // Set the items in the order
  //

  System.out.println("Total Price: " + order.getTotalPrice()); // Output total price of the order
}
}
