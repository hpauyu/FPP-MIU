package lab1;

public class Problem6 {
    public static void main(String[] args) {
        secondMin(new int[]{2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22});
    }

    public static void secondMin(int[] arrayOfInts) {
        int smallest = Integer.MAX_VALUE;
        int secondOne = Integer.MAX_VALUE;
        for (int i : arrayOfInts) {
            if (i < smallest) {
                smallest = i;
            }
        }
        for (int i : arrayOfInts) {
            if (i == smallest) {
                continue;
            }
            if (i < secondOne) {
                secondOne = i;
            }
        }
        System.out.println(secondOne);
    }
}
