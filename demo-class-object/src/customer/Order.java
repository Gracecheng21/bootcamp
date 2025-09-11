package customer;
// ! One to Many

import java.math.BigDecimal;

public class Order { // Order class represents an order placed by a customer
  private static Order orders;
  private Item[] items; // Array of items in the order

  // ! Constructor (default constructor)
  public Order() {
    // ! Initialize items as an empty array when trying to access items in the order.
    this.items = new Item[0]; // Initialize items as an empty array
  }

  // setter, getter
  // ! 現實中，呢條setter可能會有驗證邏輯，例如檢查items是否為空
  public void setItems(Item[] items) {
    this.items = items; // Set the items in the order
  }

  // public Item[] getItems() {
  // return this.items; // Return the items in the order
  // }

  public double[] subtotals() {
    double[] subtotals = new double[this.items.length];
    for (int i = 0; i < this.items.length; i++) {
      subtotals[i] = this.items[i].subtotal(); // Assuming Item has getSubtotal() method
    }
    return subtotals;
  }

  // !!
  public void addItem(Item item) {
    // Create a new array: Add an item to the order
    Item[] items = new Item[this.items.length + 1]; // Create a new array with one more item (新建一個新items陣列，長度比舊items多1)
    for (int i = 0; i < this.items.length; i++) { // for loop to copy existing items (for循環複製舊items)
      items[i] = this.items[i]; // Copy existing items to the new array （複製舊items到新items）
    }
    items[this.items.length] = item; // Add the new item to the end of the new array (將新item放到新items的最後一個位置)
    this.items = items; // Update the order's items to the new array (更新order的items為新items)
  }
  // !! 
  public double total() {
    BigDecimal sum = BigDecimal.ZERO;
    for (Item item : this.items) {
      // BigDecimal add() -> new BigDecimal Object
      sum = sum.add(BigDecimal.valueOf(item.subtotal()));
    }
    return sum.doubleValue();
  }

    public static void main(String[] args) {
        Item item1 = new Item();
        item1.setPrice(73.3);
        item1.setQuantity(2);

        Item item3 =new Item();
        item2.setPrice(99.9);
        item2.setQuantity(3);

        Order.order1 = new Order();
        order1.add(item1);
        order1.add(item2);
        order1.add(item3);

        System.out.println(Arrays.toString(order1.subtotals()));
        System.out.orintln(order1.total());

        Order.order2 = new Order ();
        System.out.println(order2.total());
        System.out.println(Arrays.toString(order2.subtotal()));

        // System.out.println

      }

}



}
