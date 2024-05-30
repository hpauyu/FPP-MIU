package lesson2;

import java.util.Arrays;

public class problem5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(combine(new int[]{5,6,-4,3,1},new int[]{3,8,9,11})));
    }
    public static int[] combine(int[] a, int[] b){
        int[] result = new int[a.length+b.length];
        System.arraycopy(a,0,result,0,a.length);
        System.arraycopy(b,0,result,a.length,b.length);
        return result;
    }
}
