package edu.cnm.deepdive;

import java.util.Random;
import static edu.cnm.deepdive.Test.reveal;

/**
 * Utility class for shuffling arrays of primitives and generic objects.
 * 
 * @author spy
 * @version 0.1
 */
public class ArrayShuffles {

  public static void main(String args[]) {
    int[] ints = {20, 30, 4};
    long[] longs = {20l, 30l, 4l};
    short[] shorts = {(short) 20, (short) 30, (short) 4};
    char[] chars = {'a', 'b', 'c'};
    boolean[] booleans = {false, false, true};
    float[] floats = {4.4f, 2.2f, 3.3f};
    double[] doubles = {4.4, 2.2, 3.3};
    shuffle(ints);
    reveal(ints);
    shuffle(longs);
    reveal(longs);
    shuffle(shorts);
    reveal(shorts);
    shuffle(chars);
    reveal(chars);
    shuffle(booleans);
    reveal(booleans);
    shuffle(floats);
    reveal(floats);
    shuffle(doubles);
    reveal(doubles);
  }

  /**
   * Shuffles deck with default source of randomness. Invokes {@link #shuffle(int[], Random)}.
   * 
   * @param deck data array.
   */
  public static void shuffle(int[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm, with specified source of randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  public static void shuffle(int[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i);
      int temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }
  
  /**
   * Shuffles deck with default source of randomness. Invokes {@link #shuffle(T[], Random)}.
   * 
   * @param deck data array.
   */
  public static <T> void shuffle(T[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm, with specified source of randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  public static <T> void shuffle(T[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i);
      T temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffles deck with default source of randomness. Invokes {@link #shuffle(long[], Random)}.
   * 
   * @param deck data array.
   */
  public static void shuffle(long[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm, with specified source of randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  public static void shuffle(long[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i);
      long temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  // TODO - bool, short, char, float, double

  /**
   * Shuffles deck with default source of randomness. Invokes {@link #shuffle(short[], Random)}.
   * 
   * @param deck data array.
   */
  public static void shuffle(short[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm, with specified source of randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  public static void shuffle(short[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i);
      short temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffles deck with default source of randomness. Invokes {@link #shuffle(char[], Random)}.
   * 
   * @param deck data array.
   */
  public static void shuffle(char[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm, with specified source of randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  public static void shuffle(char[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i);
      char temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffles deck with default source of randomness. Invokes {@link #shuffle(boolean[], Random)}.
   * 
   * @param deck data array.
   */
  public static void shuffle(boolean[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm, with specified source of randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  public static void shuffle(boolean[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i);
      boolean temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffles deck with default source of randomness. Invokes {@link #shuffle(float[], Random)}.
   * 
   * @param deck data array.
   */
  public static void shuffle(float[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm, with specified source of randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  public static void shuffle(float[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i);
      float temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffles deck with default source of randomness. Invokes {@link #shuffle(double[], Random)}.
   * 
   * @param deck data array.
   */
  public static void shuffle(double[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm, with specified source of randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  public static void shuffle(double[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i);
      double temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }
}
