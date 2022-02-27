package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareDigitTest {
  @Test
  void test() {
    assertEquals(811181, new SquareDigit().squareDigits(9119));
    assertEquals(259816449, new SquareDigit().squareDigits(53987));
    assertEquals(0, new SquareDigit().squareDigits(0));
  }
}