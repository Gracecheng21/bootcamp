package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

// ! TestFile = Test Enviroment 
public class HamcrestTest {
  // ! Test List
  @Test
  void testCalculator() {
    String actualResult = "hello";
    // ! Junit 5
    assertEquals("hello", actualResult);
    // Assertions.assertEquals("hello", actualResult);

    // ! Hamcrest
    assertThat(actualResult, equalTo("hello"));
    // MatcherAssert.assertThat(actualResult, Matchers.equalTo("hello"));

    Calculator c1 = new Calculator();
    assertThat(c1.sum(10, 4), is(equalTo(14)));
  }
}