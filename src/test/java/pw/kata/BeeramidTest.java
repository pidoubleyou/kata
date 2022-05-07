package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pw.kata.Beeramid.beeramid;

class BeeramidTest {
  @Test
  void test() {
    assertEquals(0, beeramid(2, 3));
    assertEquals(1, beeramid(4, 4));
    assertEquals(2, beeramid(5, 1));
    assertEquals(3, beeramid(14, 1));
    assertEquals(3, beeramid(16, 1));
    assertEquals(12, beeramid(1500, 2));
    assertEquals(16, beeramid(5000, 3));
  }
}
