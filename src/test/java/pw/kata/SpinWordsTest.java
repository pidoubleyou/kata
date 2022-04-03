package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpinWordsTest {
  @Test
  void test() {
    assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
    assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
  }

  @Test
  void keepWordWithLessThan5() {
    assertEquals("test", new SpinWords().spinWords("test"));
  }

  @Test
  void spinWordWith5() {
    assertEquals("olleh", new SpinWords().spinWords("hello"));
  }
}
