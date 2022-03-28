package pw.kata;

import java.util.Arrays;

public class SpinWords {
  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
            .map(this::revert)
            .reduce("", (a, b) -> a + " " + b).trim();
  }

  private String revert(String word) {
    if (word.length() < 5) {
      return word;
    }

    String result = "";
    for (char letter : word.toCharArray()) {
      result = letter + result;
    }

    return result;
  }
}
