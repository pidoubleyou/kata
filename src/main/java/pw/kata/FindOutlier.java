package pw.kata;

// https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
public class FindOutlier {
  private FindOutlier() {
  }

  static int find(int[] integers) {
    int even = 0;
    int odd = 0;
    int firstEven = 0;
    int firstOdd = 0;

    for (int number : integers) {
      if (number % 2 == 0) {
        firstEven = number;
        even++;
      } else {
        firstOdd = number;
        odd++;
      }

      if (even >= 1 && odd >= 1) {
        if (odd > 1) return firstEven;
        if (even > 1) return firstOdd;
      }
    }
    return 0;
  }
}
