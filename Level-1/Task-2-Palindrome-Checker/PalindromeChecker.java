// import java.util.Scanner;

// public class PalindromeChecker {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("===== Palindrome Checker =====");

//         System.out.print("Enter a word: ");
//         String word = sc.nextLine();

//         String original = word.toLowerCase();
//         String reverse = "";

//         for (int i = original.length() - 1; i >= 0; i--) {
//             reverse = reverse + original.charAt(i);
//         }

//         if (original.equals(reverse)) {
//             System.out.println(word + " is a Palindrome.");
//         } else {
//             System.out.println(word + " is NOT a Palindrome.");
//         }

//         sc.close();
//     }
// }

import java.util.Random;
import java.util.Scanner;

class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int secret = 70;

        while (true) { 
        System.out.println("guess the no");
        int guess= sc.nextInt();z

        if (secret == guess) {
            System.out.println("Congratulations! You guessed the correct number.");
            break;
        }
        else if (secret >= guess) {
            System.out.println("Too Low! Try Again.");
        }
        else if (secret <= guess) {
            System.out.println("Too High! Try Again.");
           }
        }
    }
}