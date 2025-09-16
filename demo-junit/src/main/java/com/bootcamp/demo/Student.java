package com.bootcamp.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

// @AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode

public class Student { // Calculation skill
  private String name;
  // private Calculator calculator;
  private MathOperation mathOperation; // interface method

  // ! Dependency Injection (DI)
  public Student(String name, MathOperation mathOperation) { // calculator by get, getCalculator
    // if (calculator == null)
    // throw new IllegalArgumentException("Calculator cannot be null.");
    // this.calculator = calculator; // if null throw exception, .method -> interface
    this.mathOperation = mathOperation;
    this.name = name;
  }
  // interface MathOperation: (Calculator: sum, substract, multiply, divide)


  // public Student (String name) {
  // this.name = name;
  // this.calculator = new Calculator(); // everytime new student with new Calculator.sum, substract, multiply, divide
  // }

  // method a call method b, test method a sucess return method b answer correctly
  // ! Method A: Student.operate() calls Method B: MathOperation()
  // ! For Junit Test (Student.class), to test operate(), the test cases only cover the value add part.
  // ! Junit Framework provides Mock test functions, so that we can assume the result of internal method call.
  // public int operate(int x, int y) {
  // return this.mathOperation.operate(x, y) * x;
  // }

  public int operate(int x, int y) {
    if (x > y) {
      // ! Day 1
      // return this.mathOperation.operate(x, y) * x; // test case 1
      // ! Day 2
      return this.mathOperation.operate(x, y + 2) * x; // test case 1

    } else {
      // ! Day 1
      // return this.mathOperation.operate(x, y) * y; // test case 2
      // ! Day 2
      return this.mathOperation.operate(x, y + 3) * y; // test case 2

    }
  }

  // sum, substract, multiply, divide
  // public int sum(int x, int y) {
  // return x + y ;
  // }

  public static void main(String[] args) {
    Student s1 = new Student("John", (x, y) -> x + y);
  }
}
