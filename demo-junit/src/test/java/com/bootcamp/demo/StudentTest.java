package com.bootcamp.demo;

// static import: copy all static method from Mokito into StudentTest class.
// After static import, you no longer need to use static Mockito call.
import static org.mockito.Mockito.*; // shift command o to find what have to import

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.verification.checkers.AtLeastXNumberOfInvocationsChecker;
import org.mockito.junit.jupiter.MockitoExtension;

// Student depends on Calculator
@ExtendWith(MockitoExtension.class) // !
public class StudentTest {
  @Mock
  private MathOperation mathOperation;

  @InjectMocks
  private Student student;

  // ! You don't nees to write this main(), because the framework generates it for you.
  public static void main(String[] args) {
    StudentTest st = new StudentTest();
    // ... prepare enviroment objects (Student and MathOperation)
    st.testStudentOperate();
    st.testStudentOperate2();
  }

  // ! assertEquals: usually for raw types only: Primitives, Wrapper Class, String
  @Test
  void testStudentOperate() {
    // Student s1 = new Student("John", mathOperation);
    // test getter, setter

    // Assumption
    when(mathOperation.operate(2,6)).thenReturn(10);

    // Start Testing
    int actualResult = student.operate(2, 3);
    Assertions.assertEquals(30, actualResult); // ! object -> equals()

    verify(mathOperation, times(1)).operate(2, 6); 
    // call method times(1) once to actualResult, no times will default times(1)
  }

  @Test
  void testStudentOperate2() {
    // Student s1 = new Student("John", mathOperation);

    when(mathOperation.operate(8, 5)).thenReturn(60);;

    int actualResult = student.operate(8, 3);
    Assertions.assertEquals(480, actualResult);
    verify(mathOperation, times(1)).operate(8, 5);
  }

  

}
