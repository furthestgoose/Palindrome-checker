import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = userInput.next();
        String reversedWord = reverseString(word);

        if (word.equals(reversedWord)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }

    // Function to reverse a string
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(); // creates an object of the string builder method
        for (int i = str.length() - 1; i >= 0; i--) { // runs for every letter in the word
            reversed.append(str.charAt(i)); // appends each letter of the word in reverse to the reversed variable
        }
        return reversed.toString();
    }
}