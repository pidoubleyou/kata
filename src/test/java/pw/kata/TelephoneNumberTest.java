package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneNumberTest {

  @Test
  void format() {
    assertEquals("(123) 456-7890", TelephoneNumber.createPhoneNumber(new int[] {1,2,3,4,5,6,7,8,9,0}));
    assertEquals("(123) 456-7890", TelephoneNumber.createPhoneNumber2(new int[] {1,2,3,4,5,6,7,8,9,0}));
  }

  @Test
  void leadingZero() {
    assertEquals("(023) 006-0890", TelephoneNumber.createPhoneNumber(new int[] {0,2,3,0,0,6,0,8,9,0}));
    assertEquals("(023) 006-0890", TelephoneNumber.createPhoneNumber2(new int[] {0,2,3,0,0,6,0,8,9,0}));
  }
}