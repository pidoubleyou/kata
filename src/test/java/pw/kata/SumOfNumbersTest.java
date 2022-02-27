package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {
  SumOfNumbers s = new SumOfNumbers();

  @Test
  void test()
  {
    assertEquals(-1, s.getSum(0, -1));
    assertEquals(1, s.getSum(0, 1));
  }

  @Test
  void same() {
    assertEquals(2, s.getSum(2, 2));
  }

  @Test
  void commutative() {
    assertEquals(1, s.getSum(0, 1));
    assertEquals(1, s.getSum(1, 0));
  }

  @Test
  void largeGap() {
    assertEquals(28, s.getSum(0, 7));
  }
}