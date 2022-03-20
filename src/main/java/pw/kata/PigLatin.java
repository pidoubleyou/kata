package pw.kata;

import java.util.Arrays;
import java.util.regex.Pattern;

// https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
public class PigLatin {
  private PigLatin() {}

  public static String pigIt(String str) {
    return Arrays.stream(str.split(" "))
            .map(Word::new)
            .map(Word::toString)
            .reduce("", (a, b) -> a + " " + b)
            .trim();
  }

}

class Word {
  private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}");

  private String value;

  public Word(String value) {
    this.value = value;
  }

  public String toString() {
    if (!isPunctuation()) {
      moveFirstToLast();
      addAy();
    }
    return value;
  }

  private void addAy() {
    value += "ay";
  }

  private boolean isPunctuation() {
    return PUNCTUATION.matcher(value).matches();
  }

  private void moveFirstToLast() {
    value = value.substring(1) + value.charAt(0);
  }
}
