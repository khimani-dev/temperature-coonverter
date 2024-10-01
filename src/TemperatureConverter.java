import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TemperatureConverter {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

        System.out.println("Below is the Temperature Conversion Program");
        System.out.println("Select the conversion you would like perform");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
 
        int choice= scanner.nextInt();
        double temperature; //variable to store the temperature values

        switch (choice) {
            case 1:
            System.out.print("Enter temperature in Celsius: ");
            temperature = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f Celsius is %.2f Fahrenheit.\n", temperature, fahrenheit);
            break;

            case 2:
                // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                double celsius = fahrenheitToCelsius(temperature);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius.\n", temperature, celsius);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }

    scanner.close();
    }

    public static  double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
}