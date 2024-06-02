package lab3;

public class MaxValue {
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{5, -3, 6, 1, 9, 4, 22}));
    }

    public static int maxValue(int[] a) {
        return maxValue(a, 0, Integer.MIN_VALUE);
    }

    private static int maxValue(int[] a, int index, int max) {
        if (a.length == index) {
            return max;
        }
        if (a[index] > max)
            max = a[index];
        return maxValue(a, index + 1, max);
    }
}
