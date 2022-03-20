package pw.kata;

import java.util.Arrays;

// https://www.codewars.com/kata/550554fd08b86f84fe000a58/java
public class WhichAreIn {
  private WhichAreIn() {}

  public static String[] inArray(String[] array1, String[] array2) {

    return Arrays.stream(array1)
            .sorted()
            .filter(a1 -> Arrays.stream(array2).anyMatch(a2 -> a2.contains(a1))
    ).toArray(String[]::new);
  }
}
