package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PigLatinTest {

  @Test
  void singleWord() {
    assertEquals("ellohay", PigLatin.pigIt("hello"));
  }

  @Test
  void punctuation() {
    assertEquals("elloHay orldway !", PigLatin.pigIt("Hello world !"));
  }

  @Test
  void FixedTests() {
    assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
    assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
  }
}