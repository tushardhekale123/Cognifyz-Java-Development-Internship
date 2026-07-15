import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special = "@#$%&*!";
        String allCharacters = upper + lower + numbers + special;

        System.out.println("===== Random Password Generator =====");

        System.out.print("Enter Password Length: ");
        int length = sc.nextInt();

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allCharacters.length());
            password += allCharacters.charAt(index);
        }

        System.out.println("Generated Password: " + password);

        sc.close();
    }
}