public class Burger {
  private String meat;
  private String cheese;
  // ...
  // ...

  public static Builder builder() {
    return new Builder();
  }
  public Burger(Builder builder) {
    this.meat = builder.meat;
    this.cheese = builder.cheese;
  }

  public String getMeat() {
    return this.meat;
  }

  public String getCheese() {
    return this.cheese;
  }

  // ! Builder Pattern
  public static class Builder {
    private String meat;
    private String cheese;

    public Builder meat(String meat) {
      this.meat = meat;
      return this; // !
    }

    public Builder cheese(String cheese) {
      this.cheese = cheese;
      return this; // !
    }

    public Burger build() {
      return new Burger(this);
    }
  }

  public static void main(String[] args) {
    // ! Builder Pattern avoid assigning null value during initial creation
    //new Burger("Beef", "Parmasan");
    // if there are 10 attributes and 8 of them are null, it is hard to assign null/non-null value
    //new Burger(null, "Parmasan");
    //new Burger("Fish", null);

    Burger b1 = Burger.builder() // create Builder Object
        .meat("Chicken") //
        .cheese("Parmasan")//
        .build(); // ! Create Burger Object

    Burger b2 = Burger.builder() // create Builder Object
        .meat("Fish") //
        .build();

    Burger b3 = Burger.builder() // create Builder Object
        .cheese("Mozzeralla")//
        .build();


  }
}

