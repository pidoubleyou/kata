package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MusicDecoderTest {
  @Test
  void basicTests() {
    test("single numbers", new int[] {1, 5, 7,12}, "1,5,7,12");
    test("2 identical numbers", new int[]{1, 2, 2, 3}, "1,2*2,3");
    test("3 consecutive numbers, ascending", new int[]{1, 3, 4, 5, 7}, "1,3-5,7");
    test("3 consecutive numbers, descending", new int[]{1, 5, 4, 3, 7}, "1,5-3,7");
    test("3 numbers with same interval, descending", new int[]{1, 10, 8, 6, 7}, "1,10-6/2,7");
  }

  @Test
  void negativeNumbersInInterval() {
    test("negative number at beginning of interval", new int[]{4, -2, 0, 2, 4, 6}, "4,-2-6/2");
    test("negative number at end of interval", new int[]{4, 2, 0, -2, -4, -6}, "4,2--6/2");
    test("negative number at start and end of interval", new int[]{4, -2, -4, -6}, "4,-2--6/2");
  }

  private void test(String description, int[] raw, String encoded) {
    System.out.println(encoded);
    assertArrayEquals(raw, new MusicDecoder().uncompress(encoded), description);
  }
}