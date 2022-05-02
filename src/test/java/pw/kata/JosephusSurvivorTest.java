package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JosephusSurvivorTest {
  @Test
  void test1() {
    josephusTest(7, 3, 4);
  }

  @Test
  void test2() {
    josephusTest(11, 19, 10);
  }

  @Test
  void test3() {
    josephusTest(40, 3, 28);
  }

  @Test
  void test4() {
    josephusTest(14, 2, 13);
  }

  @Test
  void test5() {
    josephusTest(100, 1, 100);
  }

  private void josephusTest(final int n, final int k, final int result) {
    String testDescription = String.format("Testing where n = %d and k = %d", n, k);
    assertEquals(result, JosephusSurvivor.josephusSurvivor(n, k), testDescription);
  }
}