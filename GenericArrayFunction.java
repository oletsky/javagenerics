package javatraining.oletsky.arrays;

/**
 * author O.Oletsky
 * Generic function with arrays
 */

public class GenericArrayFunction {
    public static void main(String[] args) {
        System.out.println
                (GenericArrayFunction.getMiddle
                        (new Integer[] {5, 10, 8, 3, 1})
                );
    }

    static <T> T getMiddle (T[] m) {
        return m[m.length/2];
    }
}
