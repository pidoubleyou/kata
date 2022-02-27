package pw.kata;

// https://www.codewars.com/kata/54da539698b8a2ad76000228
class TenMinuteWalk {
  TenMinuteWalk() {}

  public static boolean isValid(char[] walk) {
    // Insert brilliant code here
    int x = 0;
    int y = 0;
    int minutesPassed = 0;

    for (char direction : walk) {
      switch (direction) {
        case 'n' -> x++;
        case 'e' -> y++;
        case 's' -> x--;
        case 'w' -> y--;
        default -> throw new IllegalArgumentException("illegal direction");
      }
      minutesPassed++;
    }

    return x == 0 && y == 0 && minutesPassed == 10;
  }
}
