package pw.kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BraceCheckerTest {
  private BraceChecker checker = new BraceChecker();

  @ParameterizedTest
  @MethodSource("values" )
  void test(boolean expected, String braces) {
    assertEquals(expected, checker.isValid(braces));
  }

  static Stream<Arguments> values() {
    return Stream.of(
            Arguments.of(true,"()"),
            Arguments.of(true,"[]"),
            Arguments.of(true,"{}"),
            Arguments.of(true,"(){}[]"),
            Arguments.of(true,"([{}])"),
            Arguments.of(false, "(})"),
            Arguments.of(false, "[(])"),
            Arguments.of(false, "[({})](]"),
            Arguments.of(false, "(((({{"),
            Arguments.of(false, ")((({{")
    );
  }
}