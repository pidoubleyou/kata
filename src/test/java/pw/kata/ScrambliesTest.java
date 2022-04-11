package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScrambliesTest {

  private static void testing(boolean actual, boolean expected) {
    assertEquals(expected, actual);
  }

  @Test
  void test() {
    System.out.println("Fixed Tests scramble");
    testing(Scramblies.scramble("rkqodlw", "world"), true);
    testing(Scramblies.scramble("cedewaraaossoqqyt", "codewars"), true);
    testing(Scramblies.scramble("katas", "steak"), false);
    testing(Scramblies.scramble("scriptjavx", "javascript"), false);
    testing(Scramblies.scramble("scriptingjava", "javascript"), true);
    testing(Scramblies.scramble("scriptsjava", "javascripts"), true);
    testing(Scramblies.scramble("javscripts", "javascript"), false);
    testing(Scramblies.scramble("aabbcamaomsccdd", "commas"), true);
    testing(Scramblies.scramble("commas", "commas"), true);
    testing(Scramblies.scramble("sammoc", "commas"), true);
  }

  private static int randInt(int min, int max) {
    return min + (int)(Math.random() * ((max - min) + 1));
  }
  private static String doEx(int l, int c) {
    String res = ""; int n = -1;
    for (int i = 0; i < l; i++) {
      do {
        n = randInt(97, 122);
      } while (n == c);
      res += (char)n;
    }
    return res;
  }
  public static boolean scrambleSol(String str1, String str2) {
    if (str1.length() < str2.length()) return false;
    int[] alpha1 = new int[26];
    for(int i = 0 ; i < alpha1.length ; i++) alpha1[i] = 0;
    int[] alpha2 = new int[26];
    for(int i = 0 ; i < alpha2.length ; i++) alpha2[i] = 0;
    for(int i = 0; i < str1.length(); i++) {
      int c = (int)str1.charAt(i);
      alpha1[c - 97]++;
    }
    for(int i = 0; i < str2.length(); i++) {
      int c = (int)str2.charAt(i);
      alpha2[c - 97]++;
    }
    for(int i = 0; i < 26; i++) {
      if(alpha1[i] < alpha2[i])
        return false;
    }
    return true;
  }
  @Test
  void test1() {
    System.out.println("Basic Random Tests");
    for (int i = 0; i < 4; i++) {
      int n = randInt(0, 500);
      String s1 = doEx(n, -1);
      int m = randInt(0, 200);
      String s2 = doEx(m, -1);
      boolean r = scrambleSol(s1, s2);
      //System.out.println("s1 " + s1 + " s2 " + s2 + " --> " + r);
      //System.out.println("****");
      testing(Scramblies.scramble(s1,s2),r);
    }
  }
  @Test
  void test2() {
    System.out.println("Random Tests: performance 1");
    for (int i = 0; i < 2; i++) {
      String s1 = "";
      int m = randInt(40000, 50000);
      String s2 = doEx(m, -1);
      int n = randInt(1, 2);
      if (n % 2 == 0) {
        s1 = s2 + s2;
      } else {
        s1 = s2;
        s2 = s1 + "abmosr";
      }
      boolean r = scrambleSol(s1, s2);
      testing(Scramblies.scramble(s1,s2),r);
    }
  }
  @Test
  void test3() {
    System.out.println("Random Tests: performance 2");
    for (int i = 0; i < 1; i++) {
      int n = randInt(60000, 80000);
      String s1 = doEx(n, 97);
      int m = randInt(0, 30);
      String s2 = doEx(m, 120);
      boolean r = scrambleSol(s1, s2);
      testing(Scramblies.scramble(s1,s2),r);
    }
  }
}
