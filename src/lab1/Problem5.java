package lab1;

import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(combine(new int[]{5,6,-4,3,1},new int[]{3,8,9,11})));
    }
    public static int[] combine(int[] a, int[] b){
        int[] result = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++){
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            result[i+a.length] = b[i];
        }
        return result;
    }
}
