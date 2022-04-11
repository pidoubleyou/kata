package pw.kata;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/55c04b4cc56a697bb0000048
public class Scramblies {
  private Scramblies() {}

  public static boolean scramble(String str1, String str2) {
    final Map<Integer, Long> map1 = countChars(str1);
    final Map<Integer, Long> map2 = countChars(str2);

    return map2.entrySet().stream().allMatch(x -> map1.containsKey(x.getKey()) && map1.get(x.getKey()) >= x.getValue());

  }

  private static Map<Integer, Long> countChars(String str) {
    return str
            .chars()
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }
}
