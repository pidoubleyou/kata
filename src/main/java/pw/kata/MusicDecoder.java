package pw.kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://www.codewars.com/kata/58de42bab4b74c214d0000e2
public class MusicDecoder {

    public int[] uncompress(final String music) {
      List<Integer> result = new ArrayList<>();
      for (String element : music.split("[,\\n]")) {
        if (element.contains("*")) {
          result.addAll(identicalNumber(element));
        } else if (element.contains("/")) {
          result.addAll(range(element));
        } else if (element.contains("-")) {
          result.addAll(range(element, 1));
        } else {
          result.add(singleValue(element));
        }
      }
      return result.stream().mapToInt(Integer::intValue).toArray();
    }


    private List<Integer> range(String value, int stepSize) {
      List<Integer> result = new ArrayList<>();
      final int indexToSplit = value.indexOf('-', 1);

      final int start = Integer.parseInt(value.substring(0, indexToSplit));
      final int end = Integer.parseInt(value.substring(indexToSplit + 1));
      for (int i = Math.min(start, end); i <= Math.max(start, end); i += stepSize) {
        result.add(i);
      }
      if (start > end) {
        result.sort(Collections.reverseOrder());
      }
      return result;
    }

    private List<Integer> range(String value) {
      final String[] elements = value.split("/");
      int stepSize = elements.length == 2 ? Integer.parseInt(elements[1]) : 1;
      return range(elements[0], stepSize);
    }

    private Integer singleValue(String value) {
      return Integer.parseInt(value);
    }

    private List<Integer> identicalNumber(String value) {
      List<Integer> result = new ArrayList<>();
      final String[] elements = value.split("\\*");
      for (int i = 0; i < Integer.parseInt(elements[1]); i++) {
        result.add(Integer.parseInt(elements[0]));
      }
      return result;
    }
}
