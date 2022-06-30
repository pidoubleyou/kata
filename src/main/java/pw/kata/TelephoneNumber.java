package pw.kata;

// https://www.codewars.com/kata/525f50e3b73515a6db000b83
class PhoneNumber {
  private final int prefix;
  private final int middle;
  private final int suffix;

  public PhoneNumber(int[] numbers) {
    prefix = toNumber(numbers, 0, 3);
    middle = toNumber(numbers, 3, 3);
    suffix = toNumber(numbers, 6, 4);
  }

  private static int toNumber(int[] numbers, int index, int amount) {
    int result = 0;
    for (int i = index; i < index + amount; i++) {
      result = result * 10 + numbers[i];
    }
    return result;
  }

  public String toString() {
    return String.format("(%03d) %03d-%04d", prefix, middle, suffix);
  }
}

public class TelephoneNumber {
  private TelephoneNumber() {}

  public static String createPhoneNumber(int[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
  }

  public static String createPhoneNumber2(int[] numbers) {
    return new PhoneNumber(numbers)
            .toString();
  }
}
