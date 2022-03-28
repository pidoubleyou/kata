package pw.kata;

import java.util.Stack;

// https://www.codewars.com/kata/550f22f4d758534c1100025a
public class DirReduction {
  private DirReduction() {}

  public static String[] dirReduc(String[] arr) {

    Stack<String> result = new Stack<>();

    for (String direction : arr) {
      if (!result.empty() && isOpposite(direction, result.peek())) {
        result.pop();
      } else {
        result.push(direction);
      }
    }

    return result.toArray(String[]::new);
  }

  private static boolean isOpposite(String direction, String previous) {
    switch (direction) {
      case "NORTH":
        return "SOUTH".equals(previous);
      case "SOUTH":
        return "NORTH".equals(previous);
      case "WEST":
        return "EAST".equals(previous);
      case "EAST":
        return "WEST".equals(previous);
    }
    return false;
  }
}
