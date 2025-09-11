package com.bootcamp.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode // !

public abstract class Animal {
  private int age;

  public Animal (int age) {
    this.age = age;
  }
}
