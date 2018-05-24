package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author spy
 *
 */
public class Shuffle {
  
  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    int[] deck = createDeck(Integer.parseInt(args[0]));
    reveal(deck);
    shuffle(deck);
    reveal(deck);
  }
  
  private static int[] createDeck(int size) {
    int[] deck = new int[size];
    for (int i = 0; i < size; i++) {
      deck[i] = i;
    }
    return deck;
  }
  
  private static void shuffle(int[] deck) {
    Random rng = new Random();
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i);
      int temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }
  
  private static void reveal(int[] deck) {
//    for (int card : deck) {
//      System.out.print(card + " ");
//    }
//    System.out.println();
    System.out.println(Arrays.toString(deck));
  }
}
