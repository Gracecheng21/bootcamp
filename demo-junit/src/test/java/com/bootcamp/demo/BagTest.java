package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.bootcamp.demo.Bag.Ball;

public class BagTest {

  @Test
  void testBagCreation() {
    Bag b1 = new Bag();
    assertEquals(0, b1.getBalls().size());
  }

  @Test
  void testAdd() {
    Bag b1 = new Bag();
    b1.add(Ball.ofBlue());
    b1.add(Ball.ofYellow());
    assertEquals(2, b1.getBalls().size());

    // ! Hamcrest
    assertThat(b1.getBalls(), hasItem(Ball.ofYellow())); // for loop
    assertThat(b1.getBalls(), not(hasItem(Ball.ofRed())));
    assertThat(b1.getBalls(), hasItems(Ball.ofBlue(), Ball.ofYellow()));
    // ! hasItems -> similar to containsInAnyOrder
    assertThat(b1.getBalls(), hasItems(Ball.ofYellow(), Ball.ofBlue())); 
    assertThat(b1.getBalls(), hasSize(2));
    // ! contains (with order)
    assertThat(b1.getBalls(), contains(Ball.ofBlue(), Ball.ofYellow()));
    assertThat(b1.getBalls(), not(contains(Ball.ofYellow(), Ball.ofBlue())));
    // ! containsInAnyOrder
    assertThat(b1.getBalls(), containsInAnyOrder(Ball.ofYellow(), Ball.ofBlue()));
  }
}
