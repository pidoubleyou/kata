package pw.kata;

// https://www.codewars.com/kata/52685f7382004e774f0001f7
public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int sec = seconds % 60;
    int min = seconds / 60 % 60;
    int hour = seconds / 3600;

    return String.format("%02d:%02d:%02d", hour, min, sec);
  }
}
