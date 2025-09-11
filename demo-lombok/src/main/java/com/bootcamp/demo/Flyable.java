package com.bootcamp.demo;

// ! Java 8: Interface
public interface Flyable {
  void fly();

// after java 8 - default method in Interface
// concreate method
  default void swim() {
    System.out.println("By Default, I am able to swim ...");
  }
}