package lab3;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 3, 5, 7, 9, 13})));
        System.out.println(Arrays.toString(reverseArray(new int[]{})));
    }

    public static int[] reverseArray(int[] a) {
        return reverseArray(a, 0, a.length - 1);
    }

    private static int[] reverseArray(int[] a, int start, int end) {
        if (start >= end) {
            return a;
        }
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        return reverseArray(a, start + 1, end - 1);
    }
}
