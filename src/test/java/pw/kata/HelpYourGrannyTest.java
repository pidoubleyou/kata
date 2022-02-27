package pw.kata;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

// test cases from codewars.com kata
// https://www.codewars.com/kata/5536a85b6ed4ee5a78000035
class HelpYourGrannyTest {
  @Test
  void test1() {
    String[] friends1 = new String[] { "A1", "A2", "A3", "A4", "A5" };
    String[][] fTowns1 = { new String[] {"A1", "X1"}, new String[] {"A2", "X2"}, new String[] {"A3", "X3"},
            new String[] {"A4", "X4"} };
    Map<String, Double> distTable1 = new HashMap<>();
    distTable1.put("X1", 100.0); distTable1.put("X2", 200.0); distTable1.put("X3", 250.0);
    distTable1.put("X4", 300.0);
    assertEquals(889, HelpYourGranny.tour(friends1, fTowns1, distTable1));
  }

  @Test
  void test2() {
    String[] friends1 = new String[] { "A1", "A2", "A3", "A4", "A5" };
    String[][] fTowns1 = { new String[] {"A1", "X1"}, new String[] {"A2", "X2"},
            new String[] {"A3", "X3"}, new String[] {"A4", "X4"}, new String[] {"A5", "X5"} };
    Map<String, Double> distTable1 = new HashMap<>();
    distTable1.put("X1", 100.0); distTable1.put("X2", 200.0); distTable1.put("X3", 250.0);
    distTable1.put("X4", 300.0); distTable1.put("X5", 320.0);
    assertEquals(1020, HelpYourGranny.tour(friends1, fTowns1, distTable1));
  }
  @Test
  void test3() {
    String[] friends1 = new String[] { "B1", "B2" };
    String[][] fTowns1 = { new String[] { "B1", "Y1" }, new String[] { "B2", "Y2" },
            new String[] { "B3", "Y3" }, new String[] { "B4", "Y4" }, new String[] { "B5", "Y5" } };
    Map<String, Double> distTable1 = new HashMap<>();
    distTable1.put("Y1", 50.0); distTable1.put("Y2", 70.0); distTable1.put("Y3", 90.0);
    distTable1.put("Y4", 110.0); distTable1.put("Y5", 150.0);
    assertEquals(168, HelpYourGranny.tour(friends1, fTowns1, distTable1));
  }
  @Test
  void test4() {
    String[] friends1 = new String[] { "B1", "B2", "B3" };
    String[][] fTowns1 = { new String[] { "B1", "Y1" }, new String[] { "B2", "Y2" },
            new String[] { "B3", "Y3" }, new String[] { "B4", "Y4" }, new String[] { "B5", "Y5" } };
    Map<String, Double> distTable1 = new HashMap<>();
    distTable1.put("Y1", 60.0); distTable1.put("Y2", 80.0); distTable1.put("Y3", 100.0);
    distTable1.put("Y4", 110.0); distTable1.put("Y5", 150.0);
    assertEquals(272, HelpYourGranny.tour(friends1, fTowns1, distTable1));
  }
  @Test
  void test5() {
    String[] friends1 = new String[] { "B1", "B2", "B3", "B4" };
    String[][] fTowns1 = { new String[] { "B1", "Y1" }, new String[] { "B2", "Y2" },
            new String[] { "B3", "Y3" }, new String[] { "B4", "Y4" }, new String[] { "B5", "Y5" } };
    Map<String, Double> distTable1 = new HashMap<>();
    distTable1.put("Y1", 60.0); distTable1.put("Y2", 80.0); distTable1.put("Y3", 100.0);
    distTable1.put("Y4", 110.0); distTable1.put("Y5", 150.0);
    assertEquals(328, HelpYourGranny.tour(friends1, fTowns1, distTable1));
  }
  @Test
  void test6() {
    String[] friends1 = new String[] { "B1", "B2", "B3", "B4", "B5" };
    String[][] fTowns1 = { new String[] { "B1", "Y1" }, new String[] { "B2", "Y2" },
            new String[] { "B3", "Y3" }, new String[] { "B4", "Y4" }, new String[] { "B5", "Y5" } };
    Map<String, Double> distTable1 = new HashMap<>();
    distTable1.put("Y1", 60.0); distTable1.put("Y2", 80.0); distTable1.put("Y3", 100.0);
    distTable1.put("Y4", 110.0); distTable1.put("Y5", 150.0);
    assertEquals(470, HelpYourGranny.tour(friends1, fTowns1, distTable1));
  }
  @Test
  void test7() {
    String[] friends1 = new String[] { "B1", "B2", "B3", "B4", "B5", "B6" };
    String[][] fTowns1 = { new String[] { "B1", "Y1" }, new String[] { "B2", "Y2" },
            new String[] { "B3", "Y3" }, new String[] { "B4", "Y4" }, new String[] { "B5", "Y5" }, new String[] { "B6", "Y6" } };
    Map<String, Double> distTable1 = new HashMap<>();
    distTable1.put("Y1", 60.0); distTable1.put("Y2", 80.0); distTable1.put("Y3", 100.0);
    distTable1.put("Y4", 110.0); distTable1.put("Y5", 150.0); distTable1.put("Y6", 250.0);
    assertEquals(770, HelpYourGranny.tour(friends1, fTowns1, distTable1));
  }
  @Test
  void test8() {
    String[] friends1 = new String[] { "B1", "B2", "B4", "B5" };
    String[][] fTowns1 = { new String[] { "B1", "Y1" }, new String[] { "B2", "Y2" },
            new String[] { "B3", "Y3" }, new String[] { "B4", "Y4" }, new String[] { "B5", "Y5" } };
    Map<String, Double> distTable1 = new HashMap<>();
    distTable1.put("Y1", 60.0); distTable1.put("Y2", 80.0); distTable1.put("Y3", 100.0);
    distTable1.put("Y4", 110.0); distTable1.put("Y5", 150.0); distTable1.put("Y6", 250.0);
    assertEquals(440, HelpYourGranny.tour(friends1, fTowns1, distTable1));
  }
}