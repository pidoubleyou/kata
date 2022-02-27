package pw.kata;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/55f2b110f61eb01779000053
public class SumOfNumbers {
  public int getSum(int a, int b) {
    if (a < b) {
      return sum(a, b);
    }
    return sum(b, a);
  }

  private int sum(int start, int end) {
    return IntStream.rangeClosed(start, end).sum();
  }
}
