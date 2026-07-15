import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Temperature Converter =====");

        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter Unit (C/F): ");
        char unit = sc.next().toUpperCase().charAt(0);

        if (unit == 'C') {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit = " + fahrenheit + " °F");
        }
        else if (unit == 'F') {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println("Temperature in Celsius = " + celsius + " °C");
        }
        else {
            System.out.println("Invalid Input! Please Enter C or F.");
        }

        sc.close();
    }
}