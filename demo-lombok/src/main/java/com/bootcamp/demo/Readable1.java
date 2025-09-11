package com.bootcamp.demo;

// @FunctionalInterface
public interface Readable1 {
  void read();
  

  // ! Design Approach (lazy)
  default void teach() {
    System.out.println("By Default teach() method.");
  }

  // Java 8 
  // static method default public
 static int sum(int x, int y) {
    return x + y;
  }
}
