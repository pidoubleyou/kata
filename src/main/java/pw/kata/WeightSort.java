package pw.kata;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/55c6126177c9441a570000cc/train/java
public class WeightSort {
  private WeightSort() {}

  public static String orderWeight(String strng) {

    return Arrays.stream(strng.split(" ")).sorted((o1, o2) -> {
      int sum1 = getWeight(o1);
      int sum2 = getWeight(o2);

      if (sum1 > sum2) return 1;
      if (sum1 < sum2) return -1;

      return o1.compareTo(o2);
    }).collect(Collectors.joining(" "));
  }

  private static int getWeight(String o1) {
    return o1.chars().map(c -> c - 48).sum();
  }
}
