package pw.kata;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaximumSubArraySumWithStreams {
  private MaximumSubArraySumWithStreams() {
  }

  public static int run(int[] values) {

    final List<Integer> positiveIndices = determinePositiveIndex(values);

    return createRanges(positiveIndices)
            .map(p -> getSum(values, p))
            .max(Integer::compareTo)
            .orElse(0);
  }

  private static List<Integer> determinePositiveIndex(int[] values) {
    return IntStream.range(0, values.length).filter(i -> values[i] > 0).boxed().collect(Collectors.toList());
  }

  private static Stream<Range> createRanges(List<Integer> positiveIndices) {

    return positiveIndices.stream()
            .flatMap(startIndex ->
                    Stream.concat(
                                    positiveIndices.stream().dropWhile(index -> index <= startIndex),
                                    Stream.of(startIndex)
                            )
                            .map(endIndex -> new Range(startIndex, endIndex)));
  }

  private static int getSum(int[] values, Range pair) {
    return IntStream.rangeClosed(pair.start(), pair.end()).map(i -> values[i]).sum();
  }

  record Range(
          int start,
          int end
  ) {
  }
}