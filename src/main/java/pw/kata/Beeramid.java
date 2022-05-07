package pw.kata;

public class Beeramid {
  private Beeramid() {}
  public static int beeramid(long bonus, long price) {
    long bottles = bonus/price;
    int i;
    int sum = 0;
    for(i = 0; i < bottles; i++) {
      sum += i*i;
      if (sum > bottles) {
        return i-1;
      }
    }
    return i;
  }
}
