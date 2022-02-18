package pw.kata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubArraySumTest {

  @ParameterizedTest
  @MethodSource("values" )
  void test(int expected, int[] actual) {
    assertEquals(expected, MaximumSubArraySum.run(actual));
  }

  static Stream<Arguments> values() {
    return Stream.of(
            Arguments.of(0, (new int[0])),
            Arguments.of(0, (new int[]{-1})),
            Arguments.of(0, (new int[]{-1, -7, -3})),
            Arguments.of(3, (new int[]{3})),
            // single number is max positive
            Arguments.of(3, (new int[]{-1, 3, -6})),
            Arguments.of(2, (new int[]{1, -3, 2})),
            Arguments.of(2, (new int[]{1, -1, 2})),
            Arguments.of(7, (new int[]{-2, 1, -3, 7, -4, 2, 1, -5, 4})),
            // max range
            Arguments.of(3, (new int[]{1, 2})),
            Arguments.of(3, (new int[]{2, -1, 2})),
            Arguments.of(7, (new int[]{2, 2, 3})),
            Arguments.of(25, (new int[]{9, 1, 6, 5, 4})),
            Arguments.of(6, (new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}))
    );
  }
}