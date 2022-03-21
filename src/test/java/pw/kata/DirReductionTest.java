package pw.kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DirReductionTest {
  @Test
  public void testSimpleDirReduc() {
    assertArrayEquals(
        new String[] {"WEST"},
        DirReduction.dirReduc(
            new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}),
        "\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"");
  }

  @Test
  public void testSimpleDirReduc2() {
    assertArrayEquals(
        new String[] {},
        DirReduction.dirReduc(new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}),
        "\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"");
  }

  @Test
  void testNoReduction() {
    assertArrayEquals(
        new String[] {"NORTH", "WEST", "SOUTH", "EAST"},
        DirReduction.dirReduc(new String[] {"NORTH", "WEST", "SOUTH", "EAST"}));
  }
}
