package pw.kata;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubArraySum {
  private MaximumSubArraySum() {
  }

  public static int run(int[] values) {

    final List<Integer> positiveIndex = determinePositiveIndex(values);
    final List<Pair> pairs = listToPairs(positiveIndex);

    int max = 0;
    for (Pair pair : pairs) {
      int sum = getSum(values, pair);
      if (sum > max) {
        max = sum;
      }
    }

    return max;
  }

  private static int getSum(int[] values, Pair pair) {
    int sum = 0;
    for (int i = pair.start(); i <= pair.end(); i++) {
      int value = values[i];
      sum += value;
    }
    return sum;
  }

  private static List<Integer> determinePositiveIndex(int[] values) {
    List<Integer> positives = new ArrayList<>();

    for (int i = 0; i < values.length; i++) {
      if (values[i] > 0) {
        positives.add(i);
      }
    }

    return positives;
  }

  private static List<Pair> listToPairs(List<Integer> values) {
    List<Pair> pairs = new ArrayList<>();

    for (int i = 0; i < values.size(); i++) {
      pairs.add(new Pair(values.get(i), values.get(i)));
      for (int j = i + 1; j < values.size(); j++) {
        pairs.add(new Pair(values.get(i), values.get(j)));
      }
    }
    return pairs;
  }

  record Pair(
          int start,
          int end
  ) {
  }
}
