package edu.cnm.deepdive;

import java.util.Arrays;

/**
 * 
 * @author spy
 *
 */
public class Test {
  
  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    int[] deck = createDeck(100);
    reveal(deck);
    ArrayShuffles.shuffle(deck);
    reveal(deck);
  }
  
  private static int[] createDeck(int size) {
    int[] deck = new int[size];
    for (int i = 0; i < size; i++) {
      deck[i] = i;
    }
    return deck;
  }
  
  private static void reveal(int[] deck) {
//    for (int card : deck) {
//      System.out.print(card + " ");
//    }
//    System.out.println();
    System.out.println(Arrays.toString(deck));
  }
}
