public class Task4 {
    public static void main(String[] args) {
        String input = "level"; 
        System.out.println("These word: " + input);

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
