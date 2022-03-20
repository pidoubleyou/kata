package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindOutlierTest {
  @Test
  void testExample() {
    int[] exampleTest1 = {2, 6, 8, -10, 3};
    int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
    int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
    int[] exampleTest4 = {2, 6, 8, -10, 3, 0};
    int[] exampleTest5 = {2, 4, 0, 100, 4, 11, 2602, 36};
    int[] exampleTest6 = {160, 3, 1719, 19, 11, 13, -21};
    assertEquals(3, FindOutlier.find(exampleTest1));
    assertEquals(206847684, FindOutlier.find(exampleTest2));
    assertEquals(0, FindOutlier.find(exampleTest3));
    assertEquals(3, FindOutlier.find(exampleTest4));
    assertEquals(11, FindOutlier.find(exampleTest5));
    assertEquals(160, FindOutlier.find(exampleTest6));
  }
}