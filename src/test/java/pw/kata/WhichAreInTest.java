package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhichAreInTest {
  @Test
  void test1() {
    String a[] = new String[]{ "arp", "live", "strong" };
    String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
    String r[] = new String[] { "arp", "live", "strong" };
    assertArrayEquals(r, WhichAreIn.inArray(a, b));
  }

  @Test
  void test2() {
    String a[] = new String[]{ "tarp", "mice", "bull" };
    String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
    String r[] = new String[0];
    assertArrayEquals(r, WhichAreIn.inArray(a, b));
  }

  @Test
  void testSort() {
    String a[] = new String[]{ "live", "arp", "strong" };
    String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
    String r[] = new String[] { "arp", "live", "strong" };
    assertArrayEquals(r, WhichAreIn.inArray(a, b));
  }
}