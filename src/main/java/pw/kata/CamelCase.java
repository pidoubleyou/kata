package pw.kata;

public class CamelCase {
  private CamelCase() {
  }

  public static String camelCase(String input) {
    return input.replaceAll("[A-Z]", " $0");
  }
}
