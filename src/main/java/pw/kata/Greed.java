public class Greed{
  private static int[] countDice(int[] dice) {
    // ignore index 0, algorithm is more understandable with 1-based index
    int[] counts = new int[7];
    for (int value : dice) {
      counts[value]++;
    }
    return counts;    
  }
  

  private static int score(int[] diceCounts) {
    int score = 0;
    for (int i = 0; i < diceCounts.length; i++) {
      if (isTriple(diceCounts[i])) {
        score += scoreTriple(i);
      }
      score += scoreSingle(i, diceCounts[i] % 3);
    }
    return score;
  }
  
  private static boolean isTriple(int count) {
    return count / 3 == 1;
  }

  private static int scoreTriple(int diceValue) {
    if (diceValue == 1) {
      return 1000;
    } 
    
    return diceValue*100;
  }
  
  private static int scoreSingle(int diceValue, int count) {
    int score = 0;
    if (diceValue == 1) {
      score = count*100;
    } else if (diceValue == 5) {
      score = count*50;
    }
    return score; 
  }  
  
  public static int greedy(int[] dice){
    return score(countDice(dice));    
  }
}
