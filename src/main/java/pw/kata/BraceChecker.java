package pw.kata;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class BraceChecker {

  enum BraceType {
    BRACE,
    BRACKET,
    CURLY;

    public static BraceType of(char brace) {
      switch (brace) {
        case '(':
        case ')':
          return BRACE;
        case '[':
        case ']':
          return BRACKET;
        case '{':
        case '}':
          return CURLY;
        default:
          throw new RuntimeException("invalid brace");
      }
    }
  }

  public boolean isValid(String braces) {
    Deque<BraceType> openBraces = new ConcurrentLinkedDeque<>();

    for (char brace : braces.toCharArray()) {
      switch (brace) {
        case '(':
        case '[':
        case '{':
          openBraces.push(BraceType.of(brace));
          break;
        case ')':
        case ']':
        case '}':
          if (openBraces.isEmpty())
            return false;

          if (openBraces.pop() != BraceType.of(brace))
            return false;
          break;
      }
    }

    return openBraces.isEmpty();
  }

}