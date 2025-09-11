package enum1;

// 4 Direction
public enum Direction {
  EAST(1), WEST(-1), NORTH(2), SOUTH(-2);

  private int value;

  private Direction(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  // opposite()
  public Direction opposite() {
    return Direction.valueOf(this.value * -1);
  }

  public static Direction valueOf(int value) {
    int 
    for (Direction d : Direction.values()) {
      if (d.getValue() == 0)
      return d;
    }
    return null;
  }

}
