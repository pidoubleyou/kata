package pw.kata;

// https://www.codewars.com/kata/5262119038c0985a5b00029f/train/java
public class Prime {
  private Prime() {}

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    if (num == 2 || num == 3 || num == 5 || num == 7) {
      return true;
    }
    if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
      return false;
    }

    // https://java.soeinding.de/content.php/primzahl
    final long sqrt = Math.round(Math.sqrt(num));
    for (int i = 10; i < sqrt; i++) {
      if (num % (i + 1) == 0 || num % (i + 3) == 0 || num % (i + 7) == 0 || num % (i + 9) == 0) {
        return false;
      }
    }

    return true;
  }
}
