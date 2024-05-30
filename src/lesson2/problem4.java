package lesson2;

import java.util.Arrays;

public class problem4 {
    public static void main(String[] args) {
        String[] input =  {"horse", "dog", "cat", "horse", "dog","cow"};
        String[] temp = new String[input.length];
        int counter = 0;
        for(String s : input){
            boolean duplicate = false;
           for (int i = 0; i < counter; i++){
               if (temp[i].equals(s))
                   duplicate = true;
               break;
           }
           if(!duplicate){
               temp[counter] = s;
               counter++;
           }
        }
        String[] result = new String[counter];
        System.arraycopy(temp,0,result,0,counter);
        System.out.println(Arrays.toString(result));

    }
    public static String[] distinctWords(String[] input) {
        String[] distinctWords = new String[input.length];
        int counter = 0;
        for (String s : input) {
            if(s == null) continue;
            boolean duplicate = false;
            for (int j = 0; j < counter; j++)
                if (distinctWords[j].equals(s)) {
                    duplicate = true;
                    break;
                }
            if (!duplicate) {
                distinctWords[counter] = s;
                counter++;
            }
        }

        String[] result = new String[counter];
        System.arraycopy(distinctWords, 0, result, 0, counter);

        return result;
    }
}
