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
  
  public static void reveal(int[] deck) {
    System.out.println(Arrays.toString(deck));
  }
  
  public static void reveal(long[] deck) {
    System.out.println(Arrays.toString(deck));
  }
  
  public static void reveal(short[] deck) {
    System.out.println(Arrays.toString(deck));
  }
  
  public static void reveal(char[] deck) {
    System.out.println(Arrays.toString(deck));
  }
  
  public static void reveal(boolean[] deck) {
    System.out.println(Arrays.toString(deck));
  }
  
  public static void reveal(double[] deck) {
    System.out.println(Arrays.toString(deck));
  }
  
  public static void reveal(float[] deck) {
    System.out.println(Arrays.toString(deck));
  }
}
