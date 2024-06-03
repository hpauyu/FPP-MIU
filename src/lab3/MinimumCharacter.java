package lab3;

public class MinimumCharacter {
    public static void main(String[] args) {
        System.out.println(minimumCharacter("akel"));
    }

    public static char minimumCharacter(String input) {
        if (input == "" || input.length() == 0) {
            return ' ';
        }
        if (input.length() == 1) {
            return input.charAt(0);
        }
        return input.charAt(0) <= minimumCharacter(input.substring(1)) ? input.charAt(0) : minimumCharacter(input.substring(1));
    }

}
