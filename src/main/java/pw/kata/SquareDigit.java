package pw.kata;

import java.util.ArrayList;
import java.util.List;

public class SquareDigit {

  public int squareDigits(int value) {
    int result = 0;
    int current;
    int number = value;
    List<Integer> squares = new ArrayList<>();

    while (number > 0) {
      current = number % 10;
      squares.add(current * current);
      number = number/10;
    }

    for (int i = squares.size() - 1; i >= 0; i--) {
      current =squares.get(i);
      if (current > 10) {
        result *= 100;
      }else {
        result *= 10;
      }
      result += current;
    }

    return result;
  }
}
